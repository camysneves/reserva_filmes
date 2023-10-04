package main.java.com.br.reservafilmes.service;

import com.br.reservafilmes.entity.Filme;
import com.br.reservafilmes.entity.Genero;
import com.br.reservafilmes.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GeneroService {

    static final Double gradesAvgToApprove = 7.0;

    @Autowired
    GeneroRepository repository;

    public Genero create(Genero generoFilme) {
        generoFilme.setStatus("reservado");
        return repository.save(generoFilme);
    }

    public void selecionarfilme(Long selecaogeneroId) throws Exception {
        Optional<Genero> selecaogeneroToUpdate = repository.findById(selecaogeneroId);

        if (selecionargeneroToUpdate.isPresent()) {
            if (Objects.equals(selecaofilmeToUpdate.get().getStatus(), "Reservado")) {
                reservarfilmeToUpdate.ifPresent(reservafilme -> reservafilme.setStatus("Deferido"));
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Só é possível deferir com status Ativo.");
            }
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Dados não encontrados.");
        }
        repository.save(reservafilmeToUpdate.get());
    }

    public Double retonareservafilme() {

        return repository.retornaMedia();
    }

    public List<Filme> retonareservafilme(String status) {

        return repository.retornaFilmes(status);
    }

}
