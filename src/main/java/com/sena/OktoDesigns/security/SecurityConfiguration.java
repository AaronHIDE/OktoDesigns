package com.sena.OktoDesigns.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfiguration {

    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public SecurityConfiguration(UserDetailsService userDetailsService, BCryptPasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/","/registro/**","assets/js/**", "assets/css/**", "/img/**", " /templates/usuario/**", "/assets/**", "/templates/usuario/**", "formatosCartas", "formatosInvitaciones","herramientas", "hojasDeVida", "infoFE", "infoSE", "infoCartaRenuncia", "infoInvitaciónFormal", "infoInvitacionInformal", "infoRefPersonal").permitAll() // Permitir acceso público a estas rutas
                .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf.disable())
            .formLogin(formLogin -> formLogin
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/administrador") // Opcional, redirigir a admin después del login exitoso
            )
            .logout(logout -> logout
                .permitAll()
                .logoutSuccessUrl("/login?logout")
            );
        return http.build();
    }
}