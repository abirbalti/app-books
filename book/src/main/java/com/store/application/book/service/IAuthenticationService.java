package com.store.application.book.service;

import com.store.application.book.model.User;



public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
