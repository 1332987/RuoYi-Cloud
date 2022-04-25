package com.ruoyi.gateway.service;

import com.ruoyi.common.core.exception.CaptchaException;
import com.ruoyi.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author ruoyi
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     *
     * @return AjaxResult
     * @throws CaptchaException /
     */
    AjaxResult createCaptcha() throws CaptchaException;

    /**
     * 校验验证码
     *
     * @param key   键
     * @param value 值
     * @throws CaptchaException /
     */
    void checkCaptcha(String key, String value) throws CaptchaException;
}
