package com.stock.dao;

import com.stock.model.StockDateDO;
import com.stock.model.StockDateDOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockDateDAO {
    int countByCondition(StockDateDOCondition example);

    int deleteByCondition(StockDateDOCondition example);

    int insert(StockDateDO record);

    int insertSelective(StockDateDO record);

    List<StockDateDO> selectByCondition(StockDateDOCondition example);

    int updateByConditionSelective(@Param("record") StockDateDO record, @Param("example") StockDateDOCondition example);

    int updateByCondition(@Param("record") StockDateDO record, @Param("example") StockDateDOCondition example);
}