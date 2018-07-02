package cn.itcast.crm2.mapper;

import cn.itcast.crm2.po.HHouse;
import cn.itcast.crm2.po.HHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HHouseMapper {
    int countByExample(HHouseExample example);

    int deleteByExample(HHouseExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(HHouse record);

    int insertSelective(HHouse record);

    List<HHouse> selectByExample(HHouseExample example);

    HHouse selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") HHouse record, @Param("example") HHouseExample example);

    int updateByExample(@Param("record") HHouse record, @Param("example") HHouseExample example);

    int updateByPrimaryKeySelective(HHouse record);

    int updateByPrimaryKey(HHouse record);
}