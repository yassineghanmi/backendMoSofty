package tn.dev.backend.services.servicesImp;

import tn.dev.backend.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);

    User checkUserMail(String email);
}
