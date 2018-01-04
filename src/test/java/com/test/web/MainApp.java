package com.test.web;




import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.web.bean.Emp;
import com.test.web.dao.BaseDao;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dataSource.xml");
		BaseDao baseDao = (BaseDao) context.getBean(BaseDao.class);
		int i = baseDao.findObject();
		String ename = baseDao.findForString();
		Emp emp = baseDao.findForEmp();
		List<Emp> list = baseDao.findForListEmp();
		int count = baseDao.countOfEmpByJob("SALESMAN");
		System.out.println(count);
	}
}
