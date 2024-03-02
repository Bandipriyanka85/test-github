package com.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    public String saveMailDetails(MailDetails mailDetails){
        log.info("MailDetails ::"+mailDetails.toString());
        String returnMessage = "Successfully created. Your mailid : bandipriyanka333@gmail.com";
        return  returnMessage;
    }
}
