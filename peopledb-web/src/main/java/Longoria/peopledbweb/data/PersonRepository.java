package Longoria.peopledbweb.data;

import Longoria.peopledbweb.biz.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository <Person, Long>{
}
