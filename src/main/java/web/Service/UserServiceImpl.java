package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Model.User;
import web.Repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUsers();
    }

//    @Override
//    public User readeUser(Long id) {
//        return null;
//    }
//
//    @Override
//    public void createOrUpdateUser(User user) {
//
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//
//    }
}
