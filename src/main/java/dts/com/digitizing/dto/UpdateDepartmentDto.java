package dts.com.digitizing.dto;

import lombok.Data;

@Data
public class UpdateDepartmentDto {
    private String _id;

    private String name;

    private String parent;
}
