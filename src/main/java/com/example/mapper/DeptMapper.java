package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.example.domain.Dept;

@Mapper
public interface DeptMapper {

	@Select("select * from dept")
	List<Dept> selectAll();
	
	List<Dept> selectAll2();
	
	@Select("select * from dept where deptno=#{deptno}")
	Dept selectByDeptno(int deptno);
	
	@Insert("insert into dept values (#{deptno}, #{dname}, #{loc,jdbcType=VARCHAR})")
	@SelectKey(resultType=Integer.class ,statement="select xxx.nextval from dual", keyProperty="deptno", keyColumn="deptno", before=true)
	int insert(Dept dept);
	
	@Delete("delete from dept where deptno=#{deptno}")
	int delete(int deptno);
	
	int update(Dept dept);
	
	
}
