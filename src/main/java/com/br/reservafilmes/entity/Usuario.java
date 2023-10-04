package main.java.com.br.reservafilmes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SqlResultSetMapping(
        name="UsuariosMapping",
        classes={
                @ConstructorResult(
                        targetClass= Filme.class,
                        columns={
                                @ColumnResult(name="id", type=Long.class),
                                @ColumnResult(name="nome")})})
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer email;
    private String endereco;

}
