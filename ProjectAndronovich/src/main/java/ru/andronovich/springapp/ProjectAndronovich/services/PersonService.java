package ru.andronovich.springapp.ProjectAndronovich.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.andronovich.springapp.ProjectAndronovich.models.Exhibition;
import ru.andronovich.springapp.ProjectAndronovich.models.Person;
import ru.andronovich.springapp.ProjectAndronovich.repositories.PeopleRepository;

import java.util.*;

@Service
public class PersonService {

    private final PeopleRepository peopleRepository;
    private final Person person;

    @Autowired
    public PersonService(PeopleRepository peopleRepository, Person person) {
        this.peopleRepository = peopleRepository;
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }

    public Person findOne(int id){
        Optional<Person> foundPerson = peopleRepository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void update(int id, Person updatePerson, String password){
        updatePerson.setPassword(password);
        updatePerson.setId(id);
        peopleRepository.save(updatePerson);
    }

    @Transactional
    public void addFavorite(Person person){
            peopleRepository.save(person);
        }




    public List<Exhibition> getFavorite( Person person){
        return person.getExhibitions();
    }

    @Transactional
    public void delete(Person person , Exhibition ex){


    }


}





