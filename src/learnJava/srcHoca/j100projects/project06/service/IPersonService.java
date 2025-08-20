package learnJava.srcHoca.j100projects.project06.service;

import j100projects.project06.model.Member;
import j100projects.project06.model.Person;


import java.util.List;

public interface IPersonService {
    void addPerson(Person person);
    void removePerson(String id);
    Person findById(String id);
    List<Person> getAllPeople();
    void updatePerson(Person person);
    void borrowBook(String memberId, String isbn);
    void returnBook(String memberId, String isbn);
    List<Member> getAllMembers();
}
