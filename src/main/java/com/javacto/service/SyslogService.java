package com.javacto.service;

import com.javacto.po.Syslog;
import com.javacto.po.SyslogExample;

import java.util.List;

public interface SyslogService {
    List<Syslog> selectByExample(SyslogExample example);
    int insertSelective(Syslog record);
}
