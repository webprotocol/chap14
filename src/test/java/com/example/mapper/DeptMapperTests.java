package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;
import com.example.domain.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptMapperTests {
	
	@Autowired
	DeptMapper mapper;
	
	@Test
	public void test01_selectAll() {
		System.out.println("mapper=" + mapper);
		List<Dept> list = mapper.selectAll();
		
		for (Dept d : list) {
			System.out.println(d.getDeptno() + ", " + d.getDname() + ", " + d.getLoc());
		}
	}
	
	@Test
	public void test02_selectByDeptno() {
		Dept d1 = mapper.selectByDeptno(10);
		Dept d2 = mapper.selectByDeptno(20);
		Dept d3 = mapper.selectByDeptno(88);
		
		System.out.println("d1 ==> " + d1.getDeptno() + ", " + d1.getDname() + ", " + d1.getLoc());
		System.out.println("d2 ==> " + d2.getDeptno() + ", " + d2.getDname() + ", " + d2.getLoc());
		System.out.println("d3 ==> " + d3);
		
	}
	
	@Test
	public void test03_delete() {
		try {
			int rtn = mapper.delete(10);
			System.out.println("rtn = " + rtn);
		} catch (DataIntegrityViolationException e) {
			System.out.println("부서에 소속된 직원이 있습니다. 부서삭제 불가능");
		}
	}

	@Test
	public void test03_insert() {
		Dept dept = new Dept();
		dept.setDeptno(60);
		dept.setDname("xxx");
		dept.setLoc("yyy");
		
		int rtn = mapper.insert(dept);
		System.out.println("rtn = " + rtn);
		
	}
	
	@Test
	public void test04_update() {
		Dept dept = new Dept();
		dept.setDeptno(90);
//		dept.setDname("xxx2");
		dept.setLoc("yyy2");
		
		mapper.update(dept);
		
	}
	
	@Test
	public void test04_selectAll2() {
		System.out.println("mapper=" + mapper);
		List<Dept> list = mapper.selectAll2();
		
		for (Dept d : list) {
			System.out.println(d.getDeptno() + ", " + d.getDname() + ", " + d.getLoc());
			List<Emp> emps = d.getEmp();
			for (Emp e : emps)
				System.out.println(e.getEmpno() + ", " + e.getEname() + ", " + e.getJob());
		}
	}
	
	

}
