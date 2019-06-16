package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    /**
     *  测试service层是否能够运行成功
     */
    @Test
    public void test(){
        //获取applicationContext-service.xml配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        // 获取itemsService代理对象
        ItemsService itemsService = ac.getBean("itemsService", ItemsService.class);
        // 执行方法
        Items items = itemsService.findById(1);
        // 打印输出
        System.out.println(items);
// 输出内容：Items{id=1, name='传智播客', price=1000.0, pic='null', createtime=Tue Mar 13 09:29:30 CST 2018, detail='带我走上人生巅峰'}

    }
}
