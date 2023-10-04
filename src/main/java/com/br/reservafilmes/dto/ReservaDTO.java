package main.java.com.br.reservafilmes.dto;

import lombok.Data;

@Data
public class ReservaDTO {

    private String nome;
    private Double filme;
    private Double ator;
    private Double diretor;
    private String genero;
}
