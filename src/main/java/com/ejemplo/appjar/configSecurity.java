package com.ejemplo.appjar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class configSecurity extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder PasswordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("pinocho").password(PasswordEncoder().encode("pelota12"))
                .roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       // http.authorizeRequests().anyRequest().authenticated().and().formLogin();
       http.authorizeRequests()
       .antMatchers("/**").permitAll()
       .antMatchers("/subRuta*","/nombre*","/usuario*").access("hasRole('USER')")
       .anyRequest().authenticated().and().formLogin().loginPage("/po").permitAll()
       .failureUrl("/?error=true");
    }

}
