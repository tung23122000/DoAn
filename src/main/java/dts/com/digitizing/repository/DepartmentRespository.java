package dts.com.digitizing.repository;

import dts.com.digitizing.entity.Department;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends MongoRepository<Department, Long> {

}
