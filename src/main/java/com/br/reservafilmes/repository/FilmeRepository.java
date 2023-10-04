package main.java.com.br.reservafilmes.repository;

import com.br.reservafilmes.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    List<Filme> findByNomeContainsIgnoreCase(String nome);

    @Query(value = "select " +
            "    a.* " +
            "    from " +
            "    reserva_de_filmes on" +
            "    inner join selecao_genero on " +
            "    ma.id = a.id " +
            "    inner join diretor on " +
            "    d.id = ma.filmes_id " +
            "            where " +
            "    d.id = ?1", nativeQuery = true)
    public List<Filme> listaFilmes(Long idFilmes);


}
