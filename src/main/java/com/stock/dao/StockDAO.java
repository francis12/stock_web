package com.stock.dao;

import com.stock.model.StockDO;
import com.stock.model.StockDOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockDAO {
    int countByCondition(StockDOCondition example);

    int deleteByCondition(StockDOCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(StockDO record);

    int insertSelective(StockDO record);

    List<StockDO> selectByCondition(StockDOCondition example);

    StockDO selectByPrimaryKey(Long id);

    int updateByConditionSelective(@Param("record") StockDO record, @Param("example") StockDOCondition example);

    int updateByCondition(@Param("record") StockDO record, @Param("example") StockDOCondition example);

    int updateByPrimaryKeySelective(StockDO record);

    int updateByPrimaryKey(StockDO record);
}