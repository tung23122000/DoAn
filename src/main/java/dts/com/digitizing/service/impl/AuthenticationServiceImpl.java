package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.Authentication;
import dts.com.digitizing.repository.AuthenticationRespository;
import dts.com.digitizing.service.AuthenticationService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationRespository authenticationRespository;
    private final PasswordEncoder passwordEncoder;


    public AuthenticationServiceImpl(
            AuthenticationRespository authenticationRespository,
            PasswordEncoder passwordEncoder) {this.authenticationRespository = authenticationRespository;
        this.passwordEncoder =  new BCryptPasswordEncoder();
    }

    @Override
    public List<Authentication> fillAllAu() {
        return authenticationRespository.findAll();
    }

    @Override
    public Authentication getOneAu(String email) {
//        List<Authentication> list = authenticationRespository.findAll();
//        Authentication authentication = new Authentication();
//        for (Authentication aut : list) {
//            if (aut.getEmail().equals(email)) {
//                authentication = aut;
//                break;
//            }
//        }
        return authenticationRespository.findByEmail(email);
    }

    @Override
    public void deleteAllAu() {
        authenticationRespository.deleteAll();
    }

    @Override
    public void deleteOneAu(String email) {
        List<Authentication> list = authenticationRespository.findAll();
        Authentication authentication = new Authentication();
        for (Authentication aut : list) {
            if (aut.getEmail().equals(email)) {
                authenticationRespository.delete(aut);
                break;
            }
        }
    }

    @Override
    public void createAu(Authentication authentication) {

        authentication.setPassword(this.passwordEncoder.encode(authentication.getPassword()));
         this.authenticationRespository.save(authentication);

    }

    @Override
    public void editAu(String email, Authentication authentication) {
        List<Authentication> list = authenticationRespository.findAll();
        for (Authentication aut : list) {
            if (aut.getEmail().equals(email)) {
                authenticationRespository.delete(aut);
                authenticationRespository.save(authentication);
                break;
            }
        }
    }
}
