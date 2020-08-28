package com.hunter.simple.daily.weight.record.service.dao;

import com.hunter.simple.daily.weight.record.service.domain.po.WeightRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWeightRecordDao extends JpaRepository<WeightRecord, String> {

}
