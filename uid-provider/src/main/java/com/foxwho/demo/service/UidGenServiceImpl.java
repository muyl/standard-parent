package com.foxwho.demo.service;

import com.baidu.fsg.uid.UidGenerator;
import com.github.api.UidGenService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class UidGenServiceImpl implements UidGenService {

    @Resource(name = "cachedUidGenerator")
    private UidGenerator uidGenerator;

    @Override
    public long getUid() {
        return uidGenerator.getUID();
    }
}
