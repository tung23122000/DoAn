package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Authentication;
import dts.com.digitizing.service.AuthenticationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(
            AuthenticationService authenticationService) {this.authenticationService = authenticationService;}

    @PostMapping("/createAu")
    public void createA(@RequestBody Authentication authentication){

        authenticationService.createAu(authentication);
    }

    @GetMapping("/findAllAu")
    public List<Authentication> getAllAu(){
        return authenticationService.fillAllAu();
    }

    @GetMapping("/findOneAu/{email}")
    public Authentication getOneAu(@PathVariable("email") String email){
        return authenticationService.getOneAu(email);
    }

    @PutMapping("/editAu/{email}")
    public void editAu(@PathVariable("email") String email, @RequestBody Authentication authentication){
        authenticationService.editAu(email,authentication);
    }

    @DeleteMapping("/deleteAllAu")
    public void deleteAu(){
        authenticationService.deleteAllAu();
    }

    @DeleteMapping("/deleteOneAu/{email}")
    public void deleteOAu(@PathVariable("email") String email){
        authenticationService.deleteOneAu(email);
    }

}
