package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;

import java.util.List;

public interface DepartmentSevice {
    List<Department> fillAllDe();
    Department getOneDe(String enail);
    void deleteAllDe();
    void deleteOneDe(String email);
    void createDe(Department department);
    void editDe(String email,Department department);
}
