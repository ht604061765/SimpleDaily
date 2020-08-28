package com.hunter.base.common.controller;

import com.hunter.base.common.service.IHunterBaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class HunterBaseController<Service extends IHunterBaseService> {

    @Autowired
    private Service service;

    protected Service getService() {
        return this.service;
    }

    public void setService(Service newService) {
        this.service = newService;
    }


}
