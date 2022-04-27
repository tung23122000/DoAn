package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> fillAllPo();
    Position getOnePo(String id);
    void deleteAllPo();
    void deleteOnePo(String id);
    void createpo(Position position);
    void editPo(String id,Position position);
}
