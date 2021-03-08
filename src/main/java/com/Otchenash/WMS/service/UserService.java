package com.Otchenash.WMS.service;

import com.Otchenash.WMS.entities.Product;
import com.Otchenash.WMS.entities.User;
import com.Otchenash.WMS.repositories.ProductRepoisitory;
import com.Otchenash.WMS.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> showAllUsers() {
        
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save( user );
    }

    public void deleteUser(Long id) {
        userRepository.deleteById( id );

    }

}


