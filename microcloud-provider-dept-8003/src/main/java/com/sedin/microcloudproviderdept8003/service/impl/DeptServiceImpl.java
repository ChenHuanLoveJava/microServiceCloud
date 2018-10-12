package com.sedin.microcloudproviderdept8003.service.impl;

import com.sedin.microcloudapi.Dept;
import com.sedin.microcloudproviderdept8003.dao.IDeptDao;
import com.sedin.microcloudproviderdept8003.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Auther: 陈欢
 * @Date: 2018/10/8 14:09
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao ideptdao;

    @Override
    public Dept get(int id) {
        return ideptdao.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return ideptdao.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return ideptdao.findAll();
    }


}
