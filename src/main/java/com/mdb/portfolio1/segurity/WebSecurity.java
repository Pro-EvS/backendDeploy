
package com.mdb.portfolio1.segurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurity {
    
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManager ) throws Exception{
        return http
                .httpBasic()
                .and()
                .sessionManagement()
                .and()
                .build();
    }
    
    @Bean
    UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("evelynadmin")
                .password("admin")
                .roles()
                .build());
                return  manager;            
    }
    
    @Bean
    AuthenticationManagerBuilder authManager(HttpSecurity http) throws Exception{
       return (AuthenticationManagerBuilder) http.getSharedObject(AuthenticationManagerBuilder.class)
               .userDetailsService(userDetailsService())
               .and()
               .build();
               }
    }
