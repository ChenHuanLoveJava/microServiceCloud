package com.sedin.microcloudproviderdept8002.dao;

import com.sedin.microcloudapi.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Auther: 陈欢
 * @Date: 2018/10/8 14:08
 */
@Mapper
public interface IDeptDao {

    @Insert("INSERT INTO dept(dname,loc) VALUES (#{dname},database());")
    public boolean doCreate(Dept vo);

    @Select("SELECT deptno,dname,loc FROM dept WHERE deptno=#{deptno};")
    public Dept findById(@Param("deptno") int id);

    @Select("SELECT deptno,dname,loc FROM dept;")
    public List<Dept> findAll();

}
