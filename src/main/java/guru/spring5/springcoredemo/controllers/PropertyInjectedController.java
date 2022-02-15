package guru.spring5.springcoredemo.controllers;

import guru.spring5.springcoredemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
