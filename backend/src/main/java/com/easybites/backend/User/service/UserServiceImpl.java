package com.easybites.backend.User.service;

import com.easybites.backend.User.model.User;
import com.easybites.backend.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        if(userExists(user.getEmail())){
            return "User Exists";
        }
        if(!isPasswordValid(user.getPassword())){
            return "Invalid Password";
        }
        userRepository.save(user);
        return "success";
    }

    @Override
    public String getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get().toString();
        }
        return "No User";
    }

    @Override
    public String LoginUser(User user) {
        try{
            User out = userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
            return out.toString();
        }catch(NullPointerException e){
            return "Invalid";
        }
    }

    public static boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8 || password.length()>16)
            return false;
        else {
            String uppercaseRegex = ".*[A-Z].*";
            String lowercaseRegex = ".*[a-z].*";
            String digitRegex = ".*\\d.*";
            String specialCharRegex = ".*[@#$%^&!/].*";

            boolean hasUppercase = Pattern.matches(uppercaseRegex, password);
            boolean hasLowercase = Pattern.matches(lowercaseRegex, password);
            boolean hasDigit = Pattern.matches(digitRegex, password);
            boolean hasSpecialChar = Pattern.matches(specialCharRegex, password);

            return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
        }
    }

    //check if user exists
    boolean userExists(String email){
        return userRepository.findById(email).isPresent();
    }
}
