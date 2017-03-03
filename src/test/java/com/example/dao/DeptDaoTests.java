package com.example.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptDaoTests {
	
	@Autowired
	DeptDao dao;
	
	@Test
	public void test01_insert() {
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("xxx");
		dept.setLoc("yyy");
		
		dao.insert(dept);
	}

}
