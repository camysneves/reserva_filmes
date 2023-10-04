package main.java.com.br.reservafilmes.repository;


import com.br.reservafilmes.entity.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {
}
