package com.voidlaszlo.usersapi.repositories;

import com.voidlaszlo.usersapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
