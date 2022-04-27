package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Authentication;
import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.LeaveInformation;
import dts.com.digitizing.entity.Position;
import dts.com.digitizing.service.AuthenticationService;
import dts.com.digitizing.service.DepartmentSevice;
import dts.com.digitizing.service.LeaveInformationService;
import dts.com.digitizing.service.PositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentSevice departmentSevice;

    public DepartmentController(DepartmentSevice departmentSevice) { this.departmentSevice = departmentSevice;}

    @PostMapping("/createDe")
    public void createD(@RequestBody Department department) {
        departmentSevice.createDe(department);
    }

    @GetMapping("/findAllDep")
    public List<Department> getAllDe() {
        return departmentSevice.fillAllDe();
    }

    @GetMapping("/findOneDep/{id}")
    public Department getOneDe(@PathVariable("id") String id) {
        return departmentSevice.getOneDe(id);
    }

    @PutMapping("/editDe/{id}")
    public void editDe(@PathVariable("id") String id, @RequestBody Department department) {
        departmentSevice.editDe(id, department);
    }

    @DeleteMapping("/deleteAllDe")
    public void deleteDe() {
        departmentSevice.deleteAllDe();
    }

    @DeleteMapping("/deleteOneDe/{id}")
    public void deleteODe(@PathVariable("id") String id) {
        departmentSevice.deleteOneDe(id);
    }

}
