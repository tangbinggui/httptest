package com.itheima.service;

import com.itheima.domain.Items;



public interface ItemsService {

    /**
     *  根据id查询数据
     * @param id
     * @return
     */
    public Items findById(Integer id);

}
