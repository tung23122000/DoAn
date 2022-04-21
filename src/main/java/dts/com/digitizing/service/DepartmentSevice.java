package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;
import org.bson.types.ObjectId;

import java.util.List;

public interface DepartmentSevice {
    List<Department> getall();
    Department getOne(Long slg);
    void deletedata(Long id );
    Department update(Long id,Department department);
    Department saveData(Department department);
}
