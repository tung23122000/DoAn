package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.Probationary;
import dts.com.digitizing.entity.User;
import dts.com.digitizing.repository.ProbationaryRespository;
import dts.com.digitizing.service.ProbationaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProbationaryServiceImpl implements ProbationaryService {
    private final ProbationaryRespository probationaryRespository;

    public ProbationaryServiceImpl(
            ProbationaryRespository probationaryRespository) {this.probationaryRespository = probationaryRespository;}

    @Override
    public List<Probationary> fillAllPr() {
        return probationaryRespository.findAll();
    }

    @Override
    public Probationary getOnePr(String id) {
        List<Probationary> list = probationaryRespository.findAll();
        Probationary probationary = new Probationary();
        for (Probationary pro : list) {
            if (pro.get_id().equals(id)) {
                probationary = pro;
                break;
            }
        }
        return probationary;
    }

    @Override
    public void deleteAllPr() {
        probationaryRespository.deleteAll();
    }

    @Override
    public void deleteOnePr(String id) {
        List<Probationary> list = probationaryRespository.findAll();
        for (Probationary pro : list) {
            if (pro.get_id().equals(id)) {
                probationaryRespository.delete(pro);
                break;
            }
        }
    }

    @Override
    public void createPr(Probationary probationary) {
        probationaryRespository.save(probationary);
    }

    @Override
    public void editPr(String id, Probationary probationary) {
        List<Probationary> list = probationaryRespository.findAll();
        for (Probationary pro : list) {
            if (pro.get_id().equals(id)) {
                probationaryRespository.delete(pro);
                probationaryRespository.save(probationary);
                break;
            }
        }
    }
}
