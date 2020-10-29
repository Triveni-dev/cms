package com.triveni.cms.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected UserDetailsService userDetailsService() {
        PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User.UserBuilder userbuilder=User.builder().passwordEncoder(encoder::encode);
        UserDetails user1=userbuilder
                .username("myuser1")
                .password("password")
                .roles("USER")
                .build();

        UserDetails user2=userbuilder
                .username("myuser2")
                .password("password")
                .roles("USER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user1,user2);
    }
}
