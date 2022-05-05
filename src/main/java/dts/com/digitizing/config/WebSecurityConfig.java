package dts.com.digitizing.config;

import dts.com.digitizing.service.impl.security.AuthenticationAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AuthenticationAuthService authenticationAuthService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors()
                .and()
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers( "/all", "/user").
                hasAnyRole("USER","ADMIN") // Cho phép  truy cập vào  địa chỉ này
                .antMatchers("/v3/api-docs/**",
                             "/swagger-ui/**", "/swagger-ui.html").permitAll()// Cho phép  truy cập vào  địa chỉ
                // này

                .antMatchers("/","/authentication/createAu").permitAll()
                .antMatchers("/authentication/**").permitAll()
                .anyRequest().authenticated().and().formLogin().permitAll();// Tất cả các request khác đều cần phải xác thực mới
        // được truy cập

//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authenticationAuthService).passwordEncoder(passwordEncoder());
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
