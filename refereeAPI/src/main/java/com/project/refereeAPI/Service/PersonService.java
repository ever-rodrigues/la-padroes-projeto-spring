package com.project.refereeAPI.Service;


import com.project.refereeAPI.dto.MessageResponseDTO;
import com.project.refereeAPI.entity.Person;
import com.project.refereeAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

//AQUI ENTRA TODA A REGRA DE NEGOCIO
@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Person created with Id!" + savedPerson.getId())
                .build();
    }


}
