package com.hunter.simple.daily.weight.record.service;

import com.hunter.base.common.service.IHunterBaseService;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;

import java.util.List;

public interface IWeightRecordService extends IHunterBaseService {

    WeightRecordVo addWeightRecord(WeightRecordVo vo);

    List getWeightList();

}
