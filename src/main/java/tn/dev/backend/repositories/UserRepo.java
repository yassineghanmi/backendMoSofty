package tn.dev.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.dev.backend.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
