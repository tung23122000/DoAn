package dts.com.digitizing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Document( "leaveInformation")
public class LeaveInformation {
    @Id
    private String Code;

    private Date date;

}
