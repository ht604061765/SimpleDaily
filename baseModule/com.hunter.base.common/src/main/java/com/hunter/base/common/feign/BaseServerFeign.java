package com.hunter.base.common.feign;

import com.hunter.base.common.vo.ActionLogVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Hunter
 * @date 2020/10/6
 */
@Service
@FeignClient(value = "BASE-SERVER")
public interface BaseServerFeign {

    @PostMapping("/action/log/addActionLog")
    ActionLogVo addActionLog(ActionLogVo vo);

}
