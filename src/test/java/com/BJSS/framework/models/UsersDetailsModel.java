package com.BJSS.framework.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UsersDetailsModel {
    String name;
    String job;
    String email;
    String password;
}
