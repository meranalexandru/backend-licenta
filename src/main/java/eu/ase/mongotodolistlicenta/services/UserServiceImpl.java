package eu.ase.mongotodolistlicenta.services;

import eu.ase.mongotodolistlicenta.models.User;
import eu.ase.mongotodolistlicenta.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String save(User user) {

        return userRepository.save(user).getUserId();

    }
}
