package pl.coderslab.jewelsblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.jewelsblog.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   User findFirstById(long id);
}
