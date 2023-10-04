package main.java.com.br.reservafilmes.repository;

import com.br.reservafilmes.entity.Filme;
import com.br.reservafilmes.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    public List<Genero> findByFilmeId(Long generoId);

    @Query(value = "SELECT (sum(e.nota1) + sum(nota2)) / (count(nota1) + count(nota2)) media FROM matricula_aluno e", nativeQuery = true)
    public Double retornaMedia();

    public List<Genero> findByStatus(String status);
    @Query(value = "select a from Genero m, Filme a where a.id = m.aluno.id and " +
            " m.status = :status")
    public List<Filme> retornaAlunos(String status);
}
