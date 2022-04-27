package dts.com.digitizing.dto;

import dts.com.digitizing.entity.datatypes.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class CreateGeneralInformationDto {
    private String employeeCode;

    private String fullName;

    private String office;

    private Gender gender;

    private Date dayOfBirth;

    private String nativePlace;

    private String identification;

    private Date identificationDate;

    private String identificationPlace;

    private String placeOfPermanent;

    private String address;

    private String major;

    private String level;

    private Date graduationYear;

    private String phoneNumber;

    private String socialInsuranceNumber;

    private String socialInsuranceCompany;

    private String personalIncomeTaxNumber;

    private String healthInsuranceCardNumber;

    private Date joiningDate;

    private String bankAccountNumber;

    private String bankName;

    private String bankBranch;

    private String position;

    private String department;

    private String departmentParent;

}
