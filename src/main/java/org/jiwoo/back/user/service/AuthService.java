package org.jiwoo.back.user.service;

import org.jiwoo.back.common.exception.NotLoggedInException;
import org.jiwoo.back.common.exception.UserEmailDuplicateException;
import org.jiwoo.back.user.dto.AuthDTO;
import org.jiwoo.back.user.dto.CurrentUserDTO;

public interface AuthService {
    boolean existEmail(String email);
    void signUp(AuthDTO request) throws UserEmailDuplicateException;
    CurrentUserDTO getCurrentUser() throws NotLoggedInException;
    CurrentUserDTO editUserInfo(AuthDTO request) throws NotLoggedInException;
}