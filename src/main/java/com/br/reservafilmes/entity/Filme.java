package main.java.com.br.reservafilmes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Ator> emails;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "nome-filme",
            joinColumns = @JoinColumn(name = "titulo-filme"),
            inverseJoinColumns = @JoinColumn(name = "genero-filme"))
    private Set<Usuario> filmes = new HashSet<>();

    public Filme(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
