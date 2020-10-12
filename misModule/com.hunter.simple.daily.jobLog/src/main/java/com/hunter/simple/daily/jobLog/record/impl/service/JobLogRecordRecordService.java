package com.hunter.simple.daily.jobLog.record.impl.service;

import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.service.HunterBaseService;
import com.hunter.base.common.utils.RandomUtils;
import com.hunter.simple.daily.jobLog.record.service.IJobLogRecordService;
import com.hunter.simple.daily.jobLog.record.service.dao.IJobLogRecordDao;
import com.hunter.simple.daily.jobLog.record.service.domain.cons.JobLogRecordTypeEnum;
import com.hunter.simple.daily.jobLog.record.service.domain.po.JobLogRecord;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordParamVo;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Service
public class JobLogRecordRecordService extends HunterBaseService implements IJobLogRecordService {

    @Autowired
    private IJobLogRecordDao jobLogRecordDao;

    @Autowired
    private BaseServerFeign baseServerFeign;

    @Override
    public JobLogRecordVo addJobLogRecord(JobLogRecordVo vo) {
        JobLogRecord jobLogRecord = new JobLogRecord();
        BeanUtils.copyProperties(vo,jobLogRecord);
        jobLogRecord.setGid(RandomUtils.getUUID());
        jobLogRecordDao.save(jobLogRecord);
        return vo;
    }

    @Override
    public List<JobLogRecordVo> getJobLogRecordList(JobLogRecordParamVo paramVo) {
        List<JobLogRecordVo> result = new ArrayList<>();
        Specification<JobLogRecord> specification = (root, criteriaQuery, criteriaBuilder) -> {
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

        List<JobLogRecord> weightRecords = jobLogRecordDao.findAll(specification);
        for(JobLogRecord po : weightRecords){
            JobLogRecordVo vo = new JobLogRecordVo();
            BeanUtils.copyProperties(po, vo);
            vo.setTypeName(JobLogRecordTypeEnum.valueOf(vo.getType()).getName());
            result.add(vo);
        }
        return result;
    }
}
