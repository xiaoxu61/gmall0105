package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;


    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressId(memberId);

        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getAllCatalog1(){

        List<PmsBaseCatalog1> allCatalog = userService.getAllCatalog1();
        return allCatalog;
    }

    @RequestMapping("getAllCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getAllCatalog2(){

        List<PmsBaseCatalog2> allCatalog = userService.getAllCatalog2();
        return allCatalog;
    }

    @RequestMapping("getAllCatalog")
    @ResponseBody
    public List<PmsBaseCatalog3> getAllCatalog(){

        List<PmsBaseCatalog3> allCatalog = userService.getAllCatalog();
        return allCatalog;
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers1 = userService.getAllUser();
        return umsMembers1;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }



}
