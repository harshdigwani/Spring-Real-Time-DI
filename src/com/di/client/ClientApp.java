package com.di.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.di.controller.MainController;
import com.di.vo.EmpVo;

public class ClientApp {
	
 public static void main(String args[])
 {	 MainController mc=null;
 	 EmpVo vo=new EmpVo();
	 BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/di/cfgs/applicationContext.xml"));
	 mc=factory.getBean("controller",MainController.class);
	 
	 vo.setEmpId("101");
	 vo.setEmpName("harsh".toUpperCase());
	 vo.setSalery("1000000.00");
	 
	 try {
	 System.out.println(mc.process(vo));
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	
 }
}
