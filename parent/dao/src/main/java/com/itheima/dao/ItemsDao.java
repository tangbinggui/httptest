package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    /**
     *  根据id查询数据方法
     * @param id
     * @return
     */
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
