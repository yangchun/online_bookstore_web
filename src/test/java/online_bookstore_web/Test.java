package online_bookstore_web;

import java.util.HashMap;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.online_bookstore.service.*;;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "Spring-dubbo-consumer.xml" });
	context.start();
	AddressService addressService = (AddressService) context.getBean("addressService");
	System.out.println(addressService.getAllAddress().size());
}
}
