package dts.com.digitizing.service;

import dts.com.digitizing.entity.User;

import java.util.List;

public interface UserService {
    List<User> fillAllU();
    User getOneU(String id);
    void deleteAllU();
    void deleteOneU(String id);
    void createU(User user);
    void editU(String id,User user);
}
