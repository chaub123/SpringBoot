package com.bootcamp.tool.bmicalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bootcamp.tool.bmicalculator.entity.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String firstName);

    // List<User> findByAgeGreaterThanEqual30(int age);

    // List<User> findByLastName(String lastName);


}
