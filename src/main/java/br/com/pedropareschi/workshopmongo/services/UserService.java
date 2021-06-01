package br.com.pedropareschi.workshopmongo.services;

import br.com.pedropareschi.workshopmongo.domain.User;
import br.com.pedropareschi.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return  repo.findAll();
    }
}
