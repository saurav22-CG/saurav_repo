package in.sauravit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.sauravit.Entity.Person1;
import in.sauravit.repository.PerRepository;
@Service
public class PerService {
	private PerRepository perrepo;
	public 	PerService (PerRepository perrepo) {
		this.perrepo=perrepo;
		
	}
	public void saveperson1() {
		Person1 e8 = new Person1(101,"Saurav","Male",(char) (22-12-1996));
		Person1 e1 = new Person1(102,"Ram","Male",(char) (22-12-1995));
		Person1 e2 = new Person1(103,"Shyam","Male",(char) (22-12-1993));
		Person1 e3 = new Person1(104,"Mohan","Male",(char) (22-12-1992));
		Person1 e4 = new Person1(105,"Prashant","Male",(char) (22-12-1990));
		Person1 e5 = new Person1(106,"Mitali","Feamle",(char) (22-12-1991));
		Person1 e6 = new Person1(107,"Tanu","Female",(char) (22-12-1999));
		Person1 e7 = new Person1(108,"Anjli","Female",(char) (25-12-1992));
		
		List<Person1> emps = Arrays.asList(e1, e2, e3,e4,e5,e6,e7,e8);

		perrepo.saveAll(emps);

		System.out.println("Records saved.....");
	}
}
