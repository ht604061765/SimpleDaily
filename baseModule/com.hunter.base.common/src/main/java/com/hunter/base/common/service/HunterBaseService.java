package com.hunter.base.common.service;

import com.hunter.base.common.po.HunterBasePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class HunterBaseService<M extends HunterBasePo, ID extends String, DAO extends JpaRepository<M, ID>> {

    @Autowired
    private DAO dao;

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }
}
