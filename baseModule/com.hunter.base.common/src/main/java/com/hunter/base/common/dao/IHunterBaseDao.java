package com.hunter.base.common.dao;

import com.hunter.base.common.po.HunterBasePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Administrator
 * @date 2020/9/28
 **/
public interface IHunterBaseDao<P extends HunterBasePo> extends JpaRepository<P, String>, JpaSpecificationExecutor<P> {
}
