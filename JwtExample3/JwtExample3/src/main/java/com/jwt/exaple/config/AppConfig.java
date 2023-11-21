package com.jwt.exaple.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
    @Bean
    public UserDetailsService userDetailsService(){

      UserDetails userDetails1 = User.builder().username("Khushi").password(passwordEncoder().encode("abc")).roles("ADMIN").build();

      UserDetails userDetails2 = User.builder().username("Pratiksha").password(passwordEncoder().encode("12345")).roles("NORMAL").build();

      return new InMemoryUserDetailsManager(userDetails1,userDetails2);
    }


    @Bean
    public PasswordEncoder passwordEncoder()
    {
         return new BCryptPasswordEncoder();
    }


}
