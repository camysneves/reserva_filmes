package main.java.com.br.reservafilmes.service;

import com.br.reservafilmes.entity.Filme;
import com.br.reservafilmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public List<Filme> listaTodos(){
        return repository.findAll();
    }

    public List<Filme> listaPorNome(String nome){

        return repository.findByNomeContainsIgnoreCase(nome);
    }

    public List<Filme> listaFilmes(Long idGenero){
        return repository.listaFilmes(idGenero);
    }

    public Filme create(Filme filme) {

        //Set<Curso> cursoList = Collections.singleton(new Curso().toBuilder().id(dto.getIdCurso()).build());

        //Filme filme = Filme.builder()
        //.nome(dto.getNomeFilme())
        //.email(dto.getEmailusuario())
        //.genero(GeneroList)
        //.build();

        return repository.save(filme);
    }

    public Filme update(Filme filme) {
        return repository.save(filme);
    }

    public List<Filme> findAll() {
        return repository.findAll();
    }

    public Optional<Filme> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
