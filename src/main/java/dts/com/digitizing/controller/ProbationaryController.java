package dts.com.digitizing.controller;

import dts.com.digitizing.entity.LeaveInformation;
import dts.com.digitizing.entity.Probationary;
import dts.com.digitizing.service.ProbationaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probationary")
public class ProbationaryController {
    private final ProbationaryService probationaryS;

    public ProbationaryController(ProbationaryService probationaryS) {this.probationaryS = probationaryS;}

    @PostMapping("/createPr")
    public void createPr(@RequestBody Probationary probationary) {

        probationaryS.createPr(probationary);
    }

    @GetMapping("/findAllPr")
    public List<Probationary> getAllPr() {
        return probationaryS.fillAllPr();
    }

    @GetMapping("/findOnePr/{id}")
    public Probationary getOneLe(@PathVariable("id") String id) {
        return probationaryS.getOnePr(id);
    }

    @PutMapping("/editpr/{id}")
    public void editLe(@PathVariable("id") String id, @RequestBody Probationary probationary) {
        probationaryS.editPr(id, probationary);
    }

    @DeleteMapping("/deleteAllPr")
    public void deleteLePr() {
        probationaryS.deleteAllPr();
    }

    @DeleteMapping("/deleteOnePr/{id}")
    public void deleteOPr(@PathVariable("id") String id) {
        probationaryS.deleteOnePr(id);
    }
}
