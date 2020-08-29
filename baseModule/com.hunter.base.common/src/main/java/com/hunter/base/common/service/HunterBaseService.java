package com.hunter.base.common.service;

import com.hunter.base.common.po.HunterBasePo;
import com.hunter.base.common.vo.HunterBaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class HunterBaseService<P extends HunterBasePo,V extends HunterBaseVo, ID extends String, DAO extends JpaRepository<P, ID>> {

    @Autowired
    private DAO dao;

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }
}
