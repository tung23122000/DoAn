package dts.com.digitizing.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CreateProbationaryDto {

    private String user;

    private Date signDate;

    private Date startDate;

    private Date endDate;

    private String position;

    private String department;

    private Boolean taxCommitment;


}
