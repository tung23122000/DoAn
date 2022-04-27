package dts.com.digitizing.repository;

import dts.com.digitizing.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRespository extends MongoRepository<Position,String> {
}
