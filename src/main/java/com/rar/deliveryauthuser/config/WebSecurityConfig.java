package com.rar.deliveryauthuser.config;

import com.rar.deliveryauthuser.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * O Spring já possui uma classe interna anotada com @EnableWebSecurity para sobrescrever as configurações
 * dessa classe anotamos a nossa com a mesma anotação e colocamos também a anotação @Order com a propriedade
 * ACCESS_OVERRIDER_ORDER. Definimos também dois métodos configure um responsável pela codificação da senha
 * que será informada pelo usuário a Aplicação Client e outro informando ao Spring Security que torne o
 * endpoint /oauth/register público.
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
          .antMatchers("/oauth/register")
          .antMatchers("/actuator/**")
          .antMatchers("/h2/**");
    }
}
