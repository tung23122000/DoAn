package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.LaborContract;
import dts.com.digitizing.entity.LeaveInformation;
import dts.com.digitizing.service.LaborContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laborContract")
public class LaborContractController {
    private final LaborContractService laborContractService;

    public LaborContractController(
            LaborContractService laborContractService) {this.laborContractService = laborContractService;}


    @PostMapping("/createLa")
    public void createLa(@RequestBody LaborContract laborContract) {
        laborContractService.createLa(laborContract);
    }

    @GetMapping("/findAllDLa")
    public List<LaborContract> getAllLa() {
        return laborContractService.fillAllLa();
    }

    @GetMapping("/findOneDLa/{id}")
    public LaborContract getOneDe(@PathVariable("id") String id) {
        return laborContractService.getOneLa(id);
    }

    @PutMapping("/editLa/{id}")
    public void editLa(@PathVariable("id") String id, @RequestBody LaborContract laborContract) {
        laborContractService.editLa(id, laborContract);
    }

    @DeleteMapping("/deleteAllLa")
    public void deleteLa() {
        laborContractService.deleteAllLa();
    }

    @DeleteMapping("/deleteOnele/{id}")
    public void deleteOLe(@PathVariable("id") String id) {
        laborContractService.deleteOneLa(id);
    }
}
