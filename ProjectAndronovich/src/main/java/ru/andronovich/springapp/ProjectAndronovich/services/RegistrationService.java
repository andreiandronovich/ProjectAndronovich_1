package ru.andronovich.springapp.ProjectAndronovich.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.andronovich.springapp.ProjectAndronovich.models.Person;
import ru.andronovich.springapp.ProjectAndronovich.repositories.PeopleRepository;

@Service
public class RegistrationService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void register(Person person){
        person.setRole("ROLE_USER");
        person.setGender("не указано");
        person.setAddress("не указано");
        person.setDate("не указано");
        peopleRepository.save(person);
    }
}
