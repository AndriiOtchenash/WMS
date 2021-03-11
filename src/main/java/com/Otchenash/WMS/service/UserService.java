package com.Otchenash.WMS.service;

import com.Otchenash.WMS.entities.User;
import com.Otchenash.WMS.entities.UserDto;
import com.Otchenash.WMS.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    private static ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> showAllUsers() {

        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>(  );

        for (User user: users) {
            UserDto userDto = new UserDto( user );
            userDtos.add( userDto );
        }
        return userDtos;
    }

    public UserDto addUser(User user) {
        userRepository.save( user );
        UserDto userDto = new UserDto( user );
        return userDto;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById( id );

    }

}


