package dts.com.digitizing.dto;

import lombok.Data;

@Data
public class UpdateAuthenticationDto {
    private String email;

    private  String avatar;

    private Boolean isNew;
}
