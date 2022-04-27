package dts.com.digitizing.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Document("department")
@Data

public class Department {
    @Id
    private String _id;

    private String slug;

    private String parent;

    private String name;



}
