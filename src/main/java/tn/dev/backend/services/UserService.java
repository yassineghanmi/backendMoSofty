package tn.dev.backend.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.dev.backend.entities.User;
import tn.dev.backend.repositories.UserRepo;
import tn.dev.backend.services.servicesImp.IUserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private final UserRepo userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User checkUserMail(String email) {
        return userRepository.findByEmail(email);

    }
}
