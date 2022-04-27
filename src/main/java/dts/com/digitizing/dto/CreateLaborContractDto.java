package dts.com.digitizing.dto;

import dts.com.digitizing.entity.datatypes.LaborContractType;
import lombok.Data;

import java.util.Date;

@Data
public class CreateLaborContractDto {
    private String user;

    private String company;

    private String laborContract;

    private LaborContractType LaborContractType;

    private String[]  addendum;

    private Float signingsNumber;

    private Date signDate;

    private Date startDate;

    private Date endDate;

    private String position;

    private String department;

}
