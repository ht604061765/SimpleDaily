package com.hunter.simple.daily.weight.record.impl.service;

import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.service.HunterBaseService;
import com.hunter.simple.daily.weight.record.service.IWeightRecordService;
import com.hunter.simple.daily.weight.record.service.dao.IWeightRecordDao;
import com.hunter.simple.daily.weight.record.service.domain.po.WeightRecord;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightManageParamVo;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Service
public class WeightRecordService extends HunterBaseService implements IWeightRecordService {

    @Autowired
    private IWeightRecordDao weightRecordDao;

    @Autowired
    private BaseServerFeign baseServerFeign;

    @Override
    public WeightRecordVo addWeightRecord(WeightRecordVo vo) {
        WeightRecord weightRecord = new WeightRecord();
        BeanUtils.copyProperties(vo,weightRecord);
        weightRecord.setGid(getUUID());
        weightRecordDao.save(weightRecord);
        return vo;
    }

    public static String getUUID() {
        UUID id = UUID.randomUUID();
        return id.toString().replace("-", "");
    }

    @Override
    public List<WeightRecordVo> getWeightList(WeightManageParamVo paramVo) {
        List<WeightRecordVo> result = new ArrayList<>();
        Specification<WeightRecord> specification = (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(!Objects.isNull(paramVo.getStartTime())){
                predicates.add(criteriaBuilder.ge(root.get("createTime"), paramVo.getStartTime()));
            }
            if(!Objects.isNull(paramVo.getEndTime())){
                predicates.add(criteriaBuilder.le(root.get("createTime"), paramVo.getEndTime()));
            }
            criteriaQuery.where(predicates.toArray(new Predicate[0]));
            criteriaQuery.orderBy(criteriaBuilder.desc(root.get("createTime")));
          return criteriaQuery.getRestriction();
        };

        List<WeightRecord> weightRecords = weightRecordDao.findAll(specification);
        for(WeightRecord po : weightRecords){
            WeightRecordVo vo = new WeightRecordVo();
            BeanUtils.copyProperties(po, vo);
            result.add(vo);
        }
        return result;
    }
}
