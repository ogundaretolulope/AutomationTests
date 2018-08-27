package com.BJSS.framework.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
public class UserDetailModel {

    List<UsersDetailsModel> userDetails;
    List<UserRegisterModel> userInfo;

}
