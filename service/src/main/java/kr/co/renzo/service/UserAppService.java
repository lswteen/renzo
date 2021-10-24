package kr.co.renzo.service;

import kr.co.renzo.domain.user.entity.User;
import kr.co.renzo.domain.user.service.UserService;
import kr.co.renzo.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAppService {
    @Autowired
    UserService userService;

    public UserResponse getUserById(Long id){
        User user = userService.getById(id);
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .tel(user.getTel())
                .status(user.getStatus())
                .regdt(user.getRegdt())
                .build();
    }
}
