package ua.lviv.iot.DB_Lab.repository;

import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.lviv.iot.DB_Lab.model.User;

import java.util.List;

@Api
//@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
}
