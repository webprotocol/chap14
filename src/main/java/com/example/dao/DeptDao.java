package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.Dept;
import com.example.mapper.DeptMapper;

@Repository
public class DeptDao {
	@Autowired
	DeptMapper mapper;
	
	void insert(Dept dept) {
		mapper.insert(dept);
	}

}
