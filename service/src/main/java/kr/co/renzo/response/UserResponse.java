package kr.co.renzo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private String tel;
    private String status;
    private Date regdt;
}
