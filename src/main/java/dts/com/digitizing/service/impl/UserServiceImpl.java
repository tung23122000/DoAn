package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.User;
import dts.com.digitizing.repository.UserRespository;
import dts.com.digitizing.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class UserServiceImpl implements UserService {
    private final UserRespository userRespository;

    public UserServiceImpl(UserRespository userRespository) {this.userRespository = userRespository;}

    @Override
    public List<User> fillAllU() {
        return userRespository.findAll();
    }

    @Override
    public User getOneU(String id) {
        List<User> list = userRespository.findAll();
        User user = new User();
        for (User u : list) {
            if (u.get_id().equals(id)) {
                user = u;
                break;
            }
        }
        return user;

    }

    @Override
    public void deleteAllU() {
        userRespository.deleteAll();
    }

    @Override
    public void deleteOneU(String id) {
        List<User> list = userRespository.findAll();
        for (User u : list) {
            if (u.get_id().equals(id)) {
                userRespository.delete(u);
                break;
            }
        }

    }

    @Override
    public void createU(User user) {
        userRespository.save(user);
    }

    @Override
    public void editU(String id, User user) {
        List<User> list = userRespository.findAll();
        for (User u : list) {
            if (u.get_id().equals(id)) {
                userRespository.delete(u);
                userRespository.save(user);
                break;
            }
        }
    }
}
