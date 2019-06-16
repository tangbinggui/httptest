package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 配置对应service层的注解
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {


    // 配置自动按照数据类型注入
    @Autowired
    private ItemsDao itemsDao;


    // 实现接口方法
    public Items findById(Integer id) {
        // 返回调用dao接口的根据id查询数据方法
        return itemsDao.findById(id);
    }
}
