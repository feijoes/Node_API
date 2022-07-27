package learn.springboot.demo.service;

import learn.springboot.demo.dao.UserDao;
import learn.springboot.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao){
        this.userDao = userDao;
    }
    public int addUser(User user){
        return userDao.insertUser(user);
    }
}
