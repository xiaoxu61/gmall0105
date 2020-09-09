package com.atguigu.gmall.cart;

import com.atguigu.gmall.bean.OmsCartItem;
import com.atguigu.gmall.service.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallCartServiceApplicationTests {

	@Autowired
	CartService cartService;

	@Test
	public void contextLoads() {
		OmsCartItem omsCartItem = cartService.ifCartExistByUser("1", "90");
		System.out.println(omsCartItem.toString());
	}

}
