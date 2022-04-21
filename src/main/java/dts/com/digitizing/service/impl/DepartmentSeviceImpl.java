package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.repository.DepartmentRespository;
import dts.com.digitizing.service.DepartmentSevice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentSeviceImpl implements DepartmentSevice {
    private final DepartmentRespository departmentRespository;

    public DepartmentSeviceImpl(
            DepartmentRespository departmentRespository) {this.departmentRespository = departmentRespository;}

    @Override
    public List<Department> getall() {
        return departmentRespository.findAll();
    }

    @Override
    public Department getOne(Long id) {
        Department department = new Department();

        List<Department> listData = departmentRespository.findAll();

        for (Department dep : listData) {
            if (dep.getIdRoom().equals(id)) {
                department = dep;
                break;
            }
        }
        return department;
    }

    @Override
    public void deletedata(Long id) {

        String a = new String();
        Department department = new Department();
        List<Department> listData = departmentRespository.findAll();
        for (Department dep : listData) {
            if (dep.getIdRoom() == id) {
                department = dep;
                break;
            } else {System.out.println(" that bai");}
        }
        departmentRespository.delete(department);

    }

    @Override
    public Department update(Long id, Department department) {
        Department department1 = getOne(id);
        List<Department> listData = departmentRespository.findAll();
        for (Department dep : listData) {
            if(dep.equals(department1)){
                departmentRespository.delete(dep);
                break;
            }
            else {
                break;
            }
        }

        return saveData(department);
    }

//    @Override
//    public Department update(Long id,Department department) {
//
//
//        List<Department> listData = departmentRespository.findAll();
//        for (Department dep : listData) {
//            if (dep.getIdRoom() == id) {
//                dep= department;
//                break;
//            } else {System.out.println(" that bai");}
//        }
//        return departmentRespository.save();
//    }

    @Override
    public Department saveData(Department department) {
        return departmentRespository.save(department);
    }

}
