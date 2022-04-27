package dts.com.digitizing.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document("position")
@Data

public class Position {

    @Id
    private  String _id;

    private  String title;



}
