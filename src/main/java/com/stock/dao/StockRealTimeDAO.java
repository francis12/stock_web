package com.stock.dao;

import com.stock.model.StockRealTimeDO;
import com.stock.model.StockRealTimeDOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockRealTimeDAO {
    int countByCondition(StockRealTimeDOCondition example);

    int deleteByCondition(StockRealTimeDOCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(StockRealTimeDO record);

    int insertSelective(StockRealTimeDO record);

    List<StockRealTimeDO> selectByCondition(StockRealTimeDOCondition example);

    StockRealTimeDO selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") StockRealTimeDO record, @Param("example") StockRealTimeDOCondition example);

    int updateByCondition(@Param("record") StockRealTimeDO record, @Param("example") StockRealTimeDOCondition example);

    int updateByPrimaryKeySelective(StockRealTimeDO record);

    int updateByPrimaryKey(StockRealTimeDO record);
}