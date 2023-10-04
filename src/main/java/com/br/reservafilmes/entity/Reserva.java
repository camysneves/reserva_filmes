package main.java.com.br.reservafilmes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long status;

    @OneToMany(mappedBy = "genero")
    Set<RegistroReserva> registroReserva;

    @ManyToOne
    @JoinColumn(name="metodo-pagamento")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name="classificar_id")
    private Reserva reserva;

}

