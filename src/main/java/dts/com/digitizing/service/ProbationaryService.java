package dts.com.digitizing.service;

import dts.com.digitizing.entity.Position;
import dts.com.digitizing.entity.Probationary;

import java.util.List;

public interface ProbationaryService {
    List<Probationary> fillAllPr();
    Probationary getOnePr(String id);
    void deleteAllPr();
    void deleteOnePr(String id);
    void createPr(Probationary probationary);
    void editPr(String id,Probationary probationary);
}
