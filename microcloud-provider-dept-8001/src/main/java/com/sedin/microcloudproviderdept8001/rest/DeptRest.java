package com.sedin.microcloudproviderdept8001.rest;

import com.sedin.microcloudapi.Dept;
import com.sedin.microcloudproviderdept8001.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Auther: 陈欢
 * @Date: 2018/10/8 14:08
 */
@RestController
public class DeptRest {

    @Resource
    private IDeptService iDeptService;
    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable(value = "id") int id) {
        return iDeptService.get(id);
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return iDeptService.add(dept);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return iDeptService.list();
    }

}
