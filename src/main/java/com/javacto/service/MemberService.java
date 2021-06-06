package com.javacto.service;

import com.javacto.po.Member;

public interface MemberService {
    Member selectByPrimaryKey(String id);
}
