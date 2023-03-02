package com.metazz.metamall.order;


import com.metazz.metamall.order.entity.OrderEntity;
import com.metazz.metamall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void test() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderSn("测试ing");
        orderService.save(orderEntity);
    }

}
