package com.abhi.main.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abhi.main.entity.User;
import com.abhi.main.respository.UserRespository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRespository  userRepository;
    public CustomUserDetailsService(UserRespository  userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new CustomUserDetails(user);
    }
}
