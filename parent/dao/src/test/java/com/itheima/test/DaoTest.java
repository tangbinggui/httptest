package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
    public void test(){
        // 获取applicationContext-dao.xml配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        // 获取dao代理对象
        ItemsDao dao = ac.getBean(ItemsDao.class);
        // 调用方法测试
        Items items = dao.findById(1);
        // 打印输出
        System.out.println(items);
// 输出内容：Items{id=1, name='传智播客', price=1000.0, pic='null', createtime=Tue Mar 13 09:29:30 CST 2018, detail='带我走上人生巅峰'}
    }
}
