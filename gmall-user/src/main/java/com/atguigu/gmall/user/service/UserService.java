package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMember> getUser(String id);

    int deleteUser(String id);

    List<UmsMemberReceiveAddress> getReceiveAddressId(String memberId);
}
