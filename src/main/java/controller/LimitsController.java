package controller;


import Bean.Limits;
import config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public Limits Limits(){
        return new Limits(configuration.getMaximum(), configuration.getMaximum()  );

    }
}
