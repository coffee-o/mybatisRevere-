package com.dao.cargo;

import com.domain.cargo.Packing;
import com.domain.cargo.PackingExample;
import java.util.List;

public interface PackingDao {
    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    int insert(Packing record);

    int insertSelective(Packing record);

    List<Packing> selectByExample(PackingExample example);

    Packing selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Packing record);

    int updateByPrimaryKey(Packing record);
}