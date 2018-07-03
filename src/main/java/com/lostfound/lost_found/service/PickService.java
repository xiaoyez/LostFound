package com.lostfound.lost_found.service;

import com.lostfound.lost_found.dao.PickInformationMapper;
import com.lostfound.lost_found.pojo.PickForShow;
import com.lostfound.lost_found.pojo.PickInformation;
import com.lostfound.lost_found.pojo.PickInformationKey;
import com.lostfound.lost_found.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PickService {
    @Resource
    private PickInformationMapper pickInformationMapper;

    @Resource
    private UserService userService;

    public int createPickId()
    {
        Integer id = pickInformationMapper.getMaxPickId();
        return id == null?1:id+1;
    }

    public boolean deletePick(int pick_id)
    {
        PickInformationKey key = new PickInformationKey();
        key.setPickId(pick_id);
        PickInformation pickInformation = pickInformationMapper.selectByPrimaryKey(key);
        if (pickInformation == null)
            return false;
        pickInformationMapper.deleteByPrimaryKey(key);
        return true;
    }

    public PickInformation getPickInformation(int pick_id)
    {
        PickInformationKey key = new PickInformationKey();
        key.setPickId(pick_id);
        return pickInformationMapper.selectByPrimaryKey(key);
    }

    public List<PickInformation> getPickInformationByKeyword(String keyword)
    {
        return pickInformationMapper.selectPickInformationByKeyword(keyword);
    }

    public List<PickInformation> getAllPickInformation()
    {
        return pickInformationMapper.selectAll();
    }

    public void insertPickInformation(PickInformation pickInformation)
    {
        pickInformationMapper.insertSelective(pickInformation);
    }

    public List<PickForShow> getAllMyPick(int userId)
    {
        List<PickInformation> myPickList = pickInformationMapper.selectAllByUserId(userId);
        return castAllToPickForShow(myPickList);
    }

    public PickForShow castToPickForShow(PickInformation pickInformation)
    {
        int pick_userId = pickInformation.getUserId();
        User pickUser = userService.getUserById(pick_userId);
        PickForShow pickForShow = new PickForShow(pickInformation);
        pickForShow.setPickUser(pickUser);
        return pickForShow;
    }

    public List<PickForShow> castAllToPickForShow(List<PickInformation> pickInformationList)
    {
        List<PickForShow> pickForShowList = new ArrayList<>(pickInformationList.size());
        for (PickInformation pickInformation : pickInformationList)
        {
            pickForShowList.add(castToPickForShow(pickInformation));
        }
        return pickForShowList;
    }

    public List<PickForShow> getNewistPick()
    {
        return castAllToPickForShow(pickInformationMapper.selectNewistPickInformation());
    }
}
