package com.service.email.controller;

import com.service.email.model.Email;
import com.service.email.response.MessageResponse;
import com.service.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmailRestController {

    private final EmailService emailService;

    @PostMapping("/sendEmail")
    @ResponseBody
    public Email sendEmail(@RequestBody Email email) {
        return emailService.sendEmail(email);
    }

}
