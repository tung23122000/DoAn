package dts.com.digitizing.service.impl.security;

import dts.com.digitizing.entity.Authentication;
import dts.com.digitizing.entity.security.CumstomAuthenticationDetails;
import dts.com.digitizing.repository.AuthenticationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationAuthService implements UserDetailsService {
    @Autowired
    AuthenticationRespository authenticationRespository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Authentication> user = Optional.ofNullable(authenticationRespository.findByEmail(email));
//
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + email));
//
        return user.map(CumstomAuthenticationDetails::new).get();
//        Authentication inDB = authenticationRespository.findByEmail(email);
//        if (inDB == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new CumstomAuthenticationDetails(inDB);
    }
}
