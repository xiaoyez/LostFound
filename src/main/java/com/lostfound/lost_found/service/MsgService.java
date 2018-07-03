package com.lostfound.lost_found.service;

import com.lostfound.lost_found.common.Msg;
import com.lostfound.lost_found.dao.MessageMapper;
import com.lostfound.lost_found.pojo.Message;
import com.lostfound.lost_found.pojo.MessageForShow;
import com.lostfound.lost_found.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MsgService {

    @Resource
    MessageMapper messageMapper;

    @Autowired
    UserService userService;

    public Msg add(Message message) {

        int insert = messageMapper.insert(message);


        return Msg.success();
    }

    public List<MessageForShow> getChatRecords(Integer myId, Integer yourId) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("senderId", myId);
        map.put("receiverId", yourId);
        List<Message> msgs = messageMapper.getMsgs(map);
        List<MessageForShow> messageForShows = castAllToMessageForShow(msgs);
        return messageForShows;

    }

    public MessageForShow castMessegeToMessageForeShow(Message message) {
        MessageForShow messageForShow = new MessageForShow();
        messageForShow.setContext(message.getContext());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-SS");
        messageForShow.setDate(dateFormat.format(message.getDate()));
        messageForShow.setMessageId(message.getMessageId());
        User sender = userService.getUserById(message.getSenderId());
        User reciever = userService.getUserById(message.getReceiverId());
        messageForShow.setSender(sender);
        messageForShow.setReceiver(reciever);
        return messageForShow;
    }

    /**
     * 获取所有和我聊过天的人
     * @return
     */
    public Set<User> getAllChattedUser(int userId)
    {
        List<Message> messages = messageMapper.selectByUserId(userId);
        Set<User> users = new LinkedHashSet<>();
        for (Message message : messages)
        {
            int id = message.getSenderId().equals(userId)?message.getReceiverId():message.getSenderId();
            User user = userService.getUserById(id);
            boolean enableAdd = true;
            for(User u : users)
            {
                if(u.getUserId().equals(user.getUserId()))
                {
                    enableAdd = false;
                    break;
                }
            }
            if (enableAdd)
            {
                users.add(user);
            }
        }
        return users;
    }

    public List<MessageForShow> castAllToMessageForShow(Collection<Message> messages)
    {
        List<MessageForShow> messageForShows = new ArrayList<>(messages.size());
        for (Message message : messages)
        {
            messageForShows.add(castMessegeToMessageForeShow(message));
        }
        return messageForShows;
    }
}
