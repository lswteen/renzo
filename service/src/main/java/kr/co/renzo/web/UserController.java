package kr.co.renzo.web;

import kr.co.renzo.response.UserResponse;
import kr.co.renzo.service.UserAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserAppService userAppService;

    @GetMapping("/users")
    public UserResponse getById(@RequestParam long id){
        return userAppService.getUserById(id);
    }
}
