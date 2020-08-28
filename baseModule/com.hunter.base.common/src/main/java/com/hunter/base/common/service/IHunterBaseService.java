package com.hunter.base.common.service;

import com.hunter.base.common.po.HunterBasePo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public interface IHunterBaseService<M extends HunterBasePo, ID extends String, DAO extends JpaRepository<M, ID>> {

}
