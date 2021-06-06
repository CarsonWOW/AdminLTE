package com.javacto.service.imp;

import com.javacto.mapper.MemberDao;
import com.javacto.po.Member;
import com.javacto.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImp implements MemberService {
    @Resource
    private MemberDao memberDao;
    @Override
    public Member selectByPrimaryKey(String id) {
        return memberDao.selectByPrimaryKey(id);
    }
}
