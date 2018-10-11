package com.sedin.microcloudconsumer80.controller;

import com.sedin.microcloudapi.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description:
 * @Author: 陈欢
 * @Date: 2018/10/8 15:54
 */
@RestController
public class ConsumerDeptController {
    public static final String DEPT_GET_URL = "http://MICROCLOUDPROVIDERDEPT8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://MICROCLOUDPROVIDERDEPT8001/dept/list/";
    public static final String DEPT_ADD_URL = "http://MICROCLOUDPROVIDERDEPT8001/dept/add";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/get")
    public Object getDept(long id) {
        Dept dept = restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
        return dept;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public Object listDept() {
        List<Dept> allDepts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
        return allDepts;
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) {
        Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
        return flag;
    }


}
