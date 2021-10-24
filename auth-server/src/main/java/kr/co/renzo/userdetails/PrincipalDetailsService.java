package kr.co.renzo.userdetails;

import kr.co.renzo.domain.user.entity.User;
import kr.co.renzo.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PrincipalDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByUsername(username);

        return PrincipalDetails.builder()
                .user(user)
                .build();
    }

    public UserDetails loadUserById(Long userId) throws UsernameNotFoundException {
        User user = userService.getById(userId);

        return PrincipalDetails.builder()
                .user(user)
                .build();
    }
}
