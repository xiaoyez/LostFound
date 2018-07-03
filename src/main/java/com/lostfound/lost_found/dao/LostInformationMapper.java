package com.lostfound.lost_found.dao;

import com.lostfound.lost_found.pojo.LostInformation;
import com.lostfound.lost_found.pojo.LostInformationExample;
import com.lostfound.lost_found.pojo.LostInformationKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LostInformationMapper {
    long countByExample(LostInformationExample example);

    int deleteByExample(LostInformationExample example);

    int deleteByPrimaryKey(LostInformationKey key);

    int insert(LostInformation record);

    int insertSelective(LostInformation record);

    List<LostInformation> selectByExample(LostInformationExample example);

    LostInformation selectByPrimaryKey(LostInformationKey key);

    int updateByExampleSelective(@Param("record") LostInformation record, @Param("example") LostInformationExample example);

    int updateByExample(@Param("record") LostInformation record, @Param("example") LostInformationExample example);

    int updateByPrimaryKeySelective(LostInformation record);

    int updateByPrimaryKey(LostInformation record);

    List<LostInformation> selectAll();

    @Select("select max(lost_id) from lost_information")
    Integer getMaxLostId();

    List<LostInformation> selectLostInformationByKeyword(@Param("keyword") String keyword);

    List<LostInformation> selectAllByUserId(@Param("userId") Integer userId);

    List<LostInformation> selectNewistLostInformation();
}