package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();//userMapper.getAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getUser(String id) {

        Example example = new Example(UmsMember.class);
        example.createCriteria().andEqualTo("id",id);
        List<UmsMember> umsMembers = userMapper.selectByExample(example);
        return umsMembers;
    }

    @Override
    public int deleteUser(String id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(id);

        int i = userMapper.delete(umsMember);

        return i;
    }

    public List<UmsMemberReceiveAddress> getReceiveAddressId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> receiveAddress = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return receiveAddress;
    }




}
