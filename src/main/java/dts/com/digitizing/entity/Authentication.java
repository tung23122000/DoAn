package dts.com.digitizing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Document("authentication")
@Data

public class Authentication {
    @Id
    private String email;

    private String password;

    private String avatar;

    private Boolean isNew;

}
