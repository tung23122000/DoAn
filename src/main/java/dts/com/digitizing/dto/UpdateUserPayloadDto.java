package dts.com.digitizing.dto;

import dts.com.digitizing.entity.datatypes.EmployeeClassify;
import lombok.Data;

@Data
public class UpdateUserPayloadDto {
    private UpdateAuthenticationDto UpdateAuthenticationDto;

    private CreateGeneralInformationDto generalInformation;

    private String probationary;

    private EmployeeClassify classify;

    private String laborContact;
}
