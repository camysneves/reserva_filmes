package main.java.com.br.reservafilmes.service;

import com.br.reservafilmes.entity.Ator;
import com.br.reservafilmes.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AtorService {

    @Autowired
    private AtorRepository repository;

    public Ator salvar(Ator email) {
        return repository.save(email);
    }

    public Optional<Ator> buscarPorId(Long id){
        return repository.findById(id);
    }
}
