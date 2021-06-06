package com.javacto.service.imp;

import com.javacto.mapper.SyslogDao;
import com.javacto.po.Syslog;
import com.javacto.po.SyslogExample;
import com.javacto.service.SyslogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SyslogServiceImp implements SyslogService {
    @Resource
    private SyslogDao syslogDao;
    @Override
    public List<Syslog> selectByExample(SyslogExample example) {
        return syslogDao.selectByExample(example);
    }

    @Override
    public int insertSelective(Syslog record) {
        return syslogDao.insertSelective(record);
    }
}
