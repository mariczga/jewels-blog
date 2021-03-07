package pl.coderslab.jewelsblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.jewelsblog.entities.Content;
import pl.coderslab.jewelsblog.entities.User;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
    List<User> findAllByUserId(Long id);

    @Modifying
    @Query("select t from Content t where t.title LIKE ?1% ORDER BY t.created DESC")
    List<User> selectContentsByStartOfTitle(String title);
}
