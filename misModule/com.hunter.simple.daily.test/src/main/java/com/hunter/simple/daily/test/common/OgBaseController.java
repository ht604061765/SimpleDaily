package com.hunter.simple.daily.test.common;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class OgBaseController<Service extends IService> {

    @Autowired
    private Service service;

    protected Service getService() {
        return this.service;
    }

    public void setService(Service newService) {
        this.service = newService;
    }


}
