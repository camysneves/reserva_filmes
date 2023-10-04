package main.java.com.br.reservafilmes.dto;

import com.br.reservafilmes.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class AtorDTO {

    private String nomeFilme;
    private Usuario genero;
    private List<ReservaDTO> GeneroDTO;
}
