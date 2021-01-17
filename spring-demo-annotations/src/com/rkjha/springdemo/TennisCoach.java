package com.rkjha.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Scope("singleton")
@Component
public class TennisCoach implements Coach {
    @Value("${name}")
    public String name;
    @Value("${email}")
    public String email;

    @Autowired
    @Qualifier("myFortuneService")
    public Fortune fs;

    TennisCoach() {

    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "My Tennis Coach : " + this.name + " " + this.email;
    }

    public String getMyFortune() {
        return this.fs.getMyFortune();
    }

    @PostConstruct
    public void init() {
        System.out.printf("Init Bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.printf("Destroy Bean");
    }

//	@Autowired
//	public  void setFs(FortuneService fortuneService){
//		System.out.println("Setter Called");
//		 this.fs = fortuneService;
//	}

}
