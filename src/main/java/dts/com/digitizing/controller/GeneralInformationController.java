package dts.com.digitizing.controller;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.GeneralInformation;
import dts.com.digitizing.service.GeneralInformationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generalInformation")
public class GeneralInformationController {
    private final GeneralInformationService generalInformationService;

    public GeneralInformationController(
            GeneralInformationService generalInformationService) {this.generalInformationService = generalInformationService;}

    @PostMapping("/createGe")
    public void createGe(@RequestBody GeneralInformation generalInformation) {
        generalInformationService.createGe(generalInformation);
    }

    @GetMapping("/findAllGe")
    public List<GeneralInformation> getAllGe() {
        return generalInformationService.fillAllGe();
    }

    @GetMapping("/findOneGe/{orderNumber}")
    public GeneralInformation getOneDe(@PathVariable("orderNumber") Float orderNumber) {
        return generalInformationService.getOneGe(orderNumber);
    }

    @PutMapping("/editDe/{orderNumber}")
    public void editDe(@PathVariable("orderNumber") Float orderNumber, @RequestBody GeneralInformation generalInformation) {
        generalInformationService.editGe(orderNumber, generalInformation);
    }

    @DeleteMapping("/deleteAllGe")
    public void deleteGe() {
        generalInformationService.deleteAllGe();
    }

    @DeleteMapping("/deleteOneGe/{orderNumber}")
    public void deleteODe(@PathVariable("orderNumber") Float orderNumber) {
        generalInformationService.deleteOneGe(orderNumber);
    }

}
