package main.java.com.br.reservafilmes.service;

import com.br.reservafilmes.entity.Filme;
import com.br.reservafilmes.entity.Usuario;
import com.br.reservafilmes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Usuario create(Usuario curso) {
        return repository.save(curso);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Filme> buscarListaUsuario(Long id){
        Query query = entityManager.createNativeQuery("select a.* from selecao_reserva_filme" +
                "  inner join selecao-por-genero ac on c.id = ac.id_ator" +
                "  inner join  selecao por filme a on ac.id_aluno = a.id" +
                "  where c.id = " + id, "ReservaMapping");
        List<Filme> pessoas = query.getResultList();
        return pessoas;
    }
    
}
