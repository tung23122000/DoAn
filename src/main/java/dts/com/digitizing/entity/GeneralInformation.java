package dts.com.digitizing.entity;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.Position;
import dts.com.digitizing.entity.datatypes.Gender;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Data
@Document("generalInformation")

public class GeneralInformation {
    @Id
    private float orderNumber;

    private String employeeCode;

    private String fullName;

    private String office;

    private Gender gender;

    private Date dayOfBirth;//A date-time string at UTC, such as 2019-12-03T09:54:33Z, compliant with the date-time

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

    private Position position;

    private Department department;

    private Department departmentParent;


}
