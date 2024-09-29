package in.sauravit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sauravit.Entity.Person1;
@Repository
public interface PerRepository extends JpaRepository<Person1,Integer> {
	

}
