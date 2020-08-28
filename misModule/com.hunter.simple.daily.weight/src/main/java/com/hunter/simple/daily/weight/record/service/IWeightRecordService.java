package com.hunter.simple.daily.weight.record.service;

import com.hunter.base.common.service.IHunterBaseService;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;

public interface IWeightRecordService extends IHunterBaseService {

    WeightRecordVo addWeightRecord(WeightRecordVo vo);

}
