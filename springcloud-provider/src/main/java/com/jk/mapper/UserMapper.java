package com.jk.mapper;

import com.jk.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {


    UserModel queryUser(String userName);
}
