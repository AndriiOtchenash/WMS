package com.Otchenash.WMS.repositories;

import com.Otchenash.WMS.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}