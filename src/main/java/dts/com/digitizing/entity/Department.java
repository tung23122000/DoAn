package dts.com.digitizing.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;


@Document("departments")
@Data
public class Department {
    @Id
    private  String id;
    @Field(name = "id_room")
    private Long idRoom;

    private String name;

    private String description;

    @Field(name = "number_of_employees")
    private String numberOfEmployees;

}
