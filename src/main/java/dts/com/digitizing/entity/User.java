package dts.com.digitizing.entity;



import com.fasterxml.jackson.annotation.JsonProperty;
import dts.com.digitizing.entity.datatypes.EmployeeClassify;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data


@Document("user")
public class User {
    @Id
    private String _id;

    private GeneralInformation generalInformation;

//    private Probationary probationary;

    private EmployeeClassify classify;

//    private LaborContract laborContact;

    private LeaveInformation leaveInformation;


}
