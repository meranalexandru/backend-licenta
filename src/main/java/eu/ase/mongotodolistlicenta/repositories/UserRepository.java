package eu.ase.mongotodolistlicenta.repositories;

import eu.ase.mongotodolistlicenta.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
