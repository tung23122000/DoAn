package dts.com.digitizing.entity;

import dts.com.digitizing.entity.datatypes.LaborContractType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

@Document("laborContract")
@Data
public class LaborContract {
    @Id
    private String _id;

    private User user;

    private String company;

    private String laborContract;

    private LaborContractType type;

    private String[] addendum;

    private Float signingsNumber;

    private Date signDate;

    private Date startDate;

    private Date endDate;

    private Position position;

    private Department department;

}
