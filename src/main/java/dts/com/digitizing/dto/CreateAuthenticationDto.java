package dts.com.digitizing.dto;

import lombok.Data;

@Data
public class CreateAuthenticationDto {
    private String email;

    private String password;

    private String avatar;

    private Boolean isNew;
}
