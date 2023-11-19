package pl.davidduke.petlife.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.davidduke.petlife.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUsersByUsername(String username);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserById(Long id);
}
