package com.stock.dao;

import com.stock.model.StockRealTimeLevelDO;
import com.stock.model.StockRealTimeLevelDOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockRealTimeLevelDAO {
    int countByCondition(StockRealTimeLevelDOCondition example);

    int deleteByCondition(StockRealTimeLevelDOCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(StockRealTimeLevelDO record);

    int insertSelective(StockRealTimeLevelDO record);

    List<StockRealTimeLevelDO> selectByCondition(StockRealTimeLevelDOCondition example);

    StockRealTimeLevelDO selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") StockRealTimeLevelDO record, @Param("example") StockRealTimeLevelDOCondition example);

    int updateByCondition(@Param("record") StockRealTimeLevelDO record, @Param("example") StockRealTimeLevelDOCondition example);

    int updateByPrimaryKeySelective(StockRealTimeLevelDO record);

    int updateByPrimaryKey(StockRealTimeLevelDO record);
}