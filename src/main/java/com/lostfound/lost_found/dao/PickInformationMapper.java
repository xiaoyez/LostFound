package com.lostfound.lost_found.dao;

import com.lostfound.lost_found.pojo.LostInformation;
import com.lostfound.lost_found.pojo.PickInformation;
import com.lostfound.lost_found.pojo.PickInformationExample;
import com.lostfound.lost_found.pojo.PickInformationKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PickInformationMapper {


    long countByExample(PickInformationExample example);

    int deleteByExample(PickInformationExample example);

    int deleteByPrimaryKey(PickInformationKey key);

    int insert(PickInformation record);

    int insertSelective(PickInformation record);

    List<PickInformation> selectByExample(PickInformationExample example);

    PickInformation selectByPrimaryKey(PickInformationKey key);

    int updateByExampleSelective(@Param("record") PickInformation record, @Param("example") PickInformationExample example);

    int updateByExample(@Param("record") PickInformation record, @Param("example") PickInformationExample example);

    int updateByPrimaryKeySelective(PickInformation record);

    int updateByPrimaryKey(PickInformation record);

    List<PickInformation> selectAll();

    @Select("select max(pick_id) from pick_information")
    Integer getMaxPickId();

    List<PickInformation> selectPickInformationByKeyword(@Param("keyword") String keyword);

    List<PickInformation> selectAllByUserId(@Param("userId") Integer userId);

    List<PickInformation> selectNewistPickInformation();
}