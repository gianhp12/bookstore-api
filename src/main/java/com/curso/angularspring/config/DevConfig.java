package com.curso.angularspring.config;

import com.curso.angularspring.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Autowired
    private DBService dbService;
    @Value("$(spring.jpa.hibernate.ddl-auto)")
    private String strategy;
    @Bean
    public boolean instanciaBaseDeDados(){
            this.dbService.instanciaBaseDeDados();
        return false;
    }
}
