package com.example.warehouse_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.beans.Encoder;

@Configuration
public class Security {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

      http
              .csrf(csrf -> csrf.disable())
              .authorizeHttpRequests(auth->auth


                      // USER MANAGEMENT
                      .requestMatchers("/api/users/**")
                      .hasRole("ADMIN")

                      // WAREHOUSE MANAGEMENT
                      .requestMatchers(HttpMethod.POST, "/api/warehouses")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER")

                      .requestMatchers(HttpMethod.DELETE, "/api/warehouses/**")
                      .hasRole("ADMIN")

                      .requestMatchers(HttpMethod.GET, "/api/warehouses/**")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER", "WORKER")

                      // PRODUCT MANAGEMENT
                      .requestMatchers(HttpMethod.POST, "/api/products")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER")

                      .requestMatchers(HttpMethod.DELETE, "/api/products/**")
                      .hasRole("ADMIN")

                      .requestMatchers(HttpMethod.GET, "/api/products/**")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER", "WORKER")

                      // INVENTORY
                      .requestMatchers("/api/inventories/**")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER", "WORKER")

                      // TRANSFER
                      .requestMatchers("/api/transfers/**")
                      .hasAnyRole("ADMIN", "WAREHOUSE_MANAGER")

                      .anyRequest().authenticated()


              );
        http.httpBasic(Customizer.withDefaults());
        return http.build();








    }




}
