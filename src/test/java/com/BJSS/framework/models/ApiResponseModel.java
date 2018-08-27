package com.BJSS.framework.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponseModel {

    List<UsersList> users;
    List<ResourceList> resources;

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class UsersList{
        String id;
        String first_name;
        String last_name;
        String avatar;
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class ResourceList{
        String id;
        String name;
        String year;
        String colour;
        String pantone_value;
    }
}
