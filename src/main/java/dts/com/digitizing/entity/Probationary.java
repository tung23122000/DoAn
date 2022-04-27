package dts.com.digitizing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Document("probationary")
@Data

public class Probationary {
    @Id
    private String _id;

    private User user;

    private Float agreementNumber;

    private Date signDate;

    private Date startDate;

    private Date endDate;

    private Position position;

    private Department department;

    private Boolean taxCommitment;
}
