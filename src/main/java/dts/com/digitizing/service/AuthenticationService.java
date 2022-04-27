package dts.com.digitizing.service;

import dts.com.digitizing.entity.Authentication;
import dts.com.digitizing.entity.Department;

import java.util.List;

public interface AuthenticationService {
    List<Authentication> fillAllAu();
    Authentication getOneAu(String email);
    void deleteAllAu();
    void deleteOneAu(String email);
    void createAu(Authentication authentication);
    void editAu(String id,Authentication authentication);
}
