package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.service.DepartmentSevice;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {
    private final DepartmentSevice departmentSevice;

    public DepartmentController(DepartmentSevice departmentSevice
                               ) {this.departmentSevice = departmentSevice;

    }

    @GetMapping("/all")
    public List<Department> allList(){
        System.out.println(departmentSevice.getall());
        return departmentSevice.getall();
    }
//    @GetMapping("/one/{id}")
//    public Department get(@PathVariable("id") Long Slg){
//        return departmentSevice.getOne(Slg);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable("id") Long id){
//        departmentSevice.deletedata(id);
//    }
//
//    @PostMapping("/post")
//    public Department upData(@RequestBody Department department){
//        return departmentSevice.saveData(department);
//    }
//
//    @PutMapping("/put/{id}")
//    public Department updateDate(@RequestBody Department department, @PathVariable("id") Long id){
//        return departmentSevice.update(id,department);
//    }
}
