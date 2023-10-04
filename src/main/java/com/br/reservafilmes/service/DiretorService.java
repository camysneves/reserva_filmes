package main.java.com.br.reservafilmes.service;


import com.br.reservafilmes.entity.Diretor;
import com.br.reservafilmes.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiretorService {

    @Autowired
    DiretorRepository repository;

    public Diretor create(Diretor diretor) {
        return repository.save(diretor);
    }
}
