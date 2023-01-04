package eu.ase.mongotodolistlicenta.repositories;

import eu.ase.mongotodolistlicenta.models.Task;
import eu.ase.mongotodolistlicenta.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}
