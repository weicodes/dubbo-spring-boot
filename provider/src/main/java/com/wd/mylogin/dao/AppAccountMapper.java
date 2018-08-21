package com.wd.mylogin.dao;

import com.wd.mylogin.model.AppAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppAccountMapper {

    @Select("select * from app_account where user_id=#{userId}")
    AppAccount selectByUserId(Integer userId);

//    int deleteByPrimaryKey(Integer id);
//
//    int insert(AppAccount record);
//
//    int insertSelective(AppAccount record);
//
//    AppAccount selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(AppAccount record);
//
//    int updateByPrimaryKey(AppAccount record);
}