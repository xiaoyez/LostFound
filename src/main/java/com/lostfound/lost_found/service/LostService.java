package com.lostfound.lost_found.service;

import com.lostfound.lost_found.dao.LostInformationMapper;
import com.lostfound.lost_found.pojo.LostForShow;
import com.lostfound.lost_found.pojo.LostInformation;
import com.lostfound.lost_found.pojo.LostInformationKey;
import com.lostfound.lost_found.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class LostService {
    @Resource
    private LostInformationMapper lostInformationMapper;

    @Resource
    private UserService userService;

    public int createLostId()
    {
        Integer id = lostInformationMapper.getMaxLostId();
       return id == null?1:id+1;
    }

    public boolean deleteLost(int lost_id)
    {
        LostInformationKey key = new LostInformationKey();
        key.setLostId(lost_id);
        LostInformation lostInformation = lostInformationMapper.selectByPrimaryKey(key);
        if (lostInformation == null)
            return false;
        lostInformationMapper.deleteByPrimaryKey(key);
        return true;
    }

    public LostInformation getLostInformation(int lost_id)
    {
        LostInformationKey key = new LostInformationKey();
        key.setLostId(lost_id);
        return lostInformationMapper.selectByPrimaryKey(key);
    }

    public List<LostInformation> getLostInformationByKeyword(String keyword)
    {
        return lostInformationMapper.selectLostInformationByKeyword(keyword);
    }

    public List<LostInformation> getAllLostInformation()
    {
        return lostInformationMapper.selectAll();
    }

    public void insertLostInformation(LostInformation lostInformation)
    {
        lostInformationMapper.insertSelective(lostInformation);
    }

    public List<LostForShow> getAllMyLost(int userId)
    {
        List<LostInformation> myLostList = lostInformationMapper.selectAllByUserId(userId);
        return castAllToLostForShow(myLostList);
    }

    public LostForShow castToLostForShow(LostInformation lostInformation)
    {
        int lost_userId = lostInformation.getUserId();
        User lostUser = userService.getUserById(lost_userId);
        LostForShow lostForShow = new LostForShow(lostInformation);
        lostForShow.setLostUser(lostUser);
        return lostForShow;
    }

    public List<LostForShow> castAllToLostForShow(List<LostInformation> lostInformationList)
    {
        List<LostForShow> lostForShowList = new ArrayList<>(lostInformationList.size());
        for (LostInformation lostInformation : lostInformationList)
        {
            lostForShowList.add(castToLostForShow(lostInformation));
        }
        return lostForShowList;
    }

    public List<LostForShow> getNewistLost()
    {
        return castAllToLostForShow(lostInformationMapper.selectNewistLostInformation());
    }
}
