package com.sedin.microcloudproviderdept8003.service;

import com.sedin.microcloudapi.Dept;

import java.util.List;

/**
 * @Description:
 * @Auther: 陈欢
 * @Date: 2018/10/8 14:09
 */
public interface IDeptService {
    public Dept get(int id);

    public boolean add(Dept dept);

    public List<Dept> list();

}
