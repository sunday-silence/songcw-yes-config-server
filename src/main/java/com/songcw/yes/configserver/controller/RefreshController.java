package com.songcw.yes.configserver.controller;

import com.songcw.yes.common.enums.DefaultResult;
import com.songcw.yes.common.stereotype.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-29 15:14
 */
@RestController
@Slf4j
public class RefreshController {

    // 刷新配置的控制方法
    @PostMapping(value = "/config-refresh")
    @RefreshScope
    public ResponseResult<Void> refresh() {
        log.info("------------> 配置刷新成功");
        return DefaultResult.HANDLE_SUCCESS.toResult();
    }
}
