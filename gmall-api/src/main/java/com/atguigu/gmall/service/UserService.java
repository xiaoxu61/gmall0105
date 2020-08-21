package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<PmsBaseCatalog3> getAllCatalog();
    List<PmsBaseCatalog2> getAllCatalog2();
    List<PmsBaseCatalog1> getAllCatalog1();

    List<UmsMemberReceiveAddress> getReceiveAddressId(String memberId);



}
