package com.example.msbanque;

import com.example.msbanque.web.CompteRestJaxRsAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    //@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRsAPI.class);
        return jerseyServlet;
    }
}
