package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/conge/employe")
@AllArgsConstructor

public class EmployeControllers {
   private final EmployeService employeService;
    @PostMapping
    public void registerEmploye(@RequestBody RequestRegistrationEmploye requestRegistrationEmploye){
        log.info("new employe {}", requestRegistrationEmploye);
        employeService.registerEmploye(requestRegistrationEmploye);

    }

}
