package com.sagar.springsecex.service;

import com.sagar.springsecex.security.entity.Users;

public interface UsersService {

    Users saveUsers(Users users);

    String verify(Users users);
}
