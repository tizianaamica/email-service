package com.service.email.service;

import com.service.email.model.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public Email sendEmail(Email email) {
        System.out.println("message: " + email.getMessage());
        return email;
    }
}
