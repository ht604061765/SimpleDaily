package com.hunter.simple.daily.weight.record.impl.service;

import com.hunter.base.common.service.HunterBaseService;
import com.hunter.simple.daily.weight.record.service.IWeightRecordService;
import com.hunter.simple.daily.weight.record.service.domain.po.WeightRecord;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Service
public class WeightRecordService extends HunterBaseService implements IWeightRecordService {

    @Override
    public WeightRecordVo addWeightRecord(WeightRecordVo vo) {
        WeightRecord weightRecord = new WeightRecord();
        BeanUtils.copyProperties(vo,weightRecord);
        weightRecord.setGid(getUUID());
        getDao().save(weightRecord);
        return vo;
    }

    public static String getUUID() {
        UUID id = UUID.randomUUID();
        return id.toString().replace("-", "");
    }

    @Override
    public List<WeightRecordVo> getWeightList() {
        return getDao().findAll();
    }
}
