package dts.com.digitizing.dto;

import lombok.Data;

@Data
public class UpdateUserDto {
    private String _id;

    private UpdateUserPayloadDto payload;
}
