package com.metazz.metamall.thirdparty.controller;

import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/qiNiu")
public class QiNiuController {

    @Value("${qiniuyun.accessKey}")
    private String accessKey;

    @Value("${qiniuyun.secretKey}")
    private String secretKey;

    @Value("${qiniuyun.bucket}")
    private String bucket;

    /**
     *  获得上传凭证
     */
    @RequestMapping("/getUpToken")
    public String getUpToken(){
        Auth auth = Auth.create(accessKey, secretKey);
        return auth.uploadToken(bucket);
    }

}
