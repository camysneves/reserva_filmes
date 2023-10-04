package main.java.com.br.reservafilmes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buscar-diretor")
public class DiretorController {

    @Autowired
    DiretorControllerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<SelecaoDiretor> create(@RequestBody selecaoDiretor selecaoDiretor) {
        SelecaoDiretor entidade = service.create(selecaoDiretor);

        return ResponseEntity.status(201).body(entidade);
    }

    @PatchMapping("/buscar-diretor/{ordemId}/{buscarId}")
    @ResponseStatus(HttpStatus.OK)
    public void patchGrades(@RequestBody DiretorDto DiretorDto, @PathVariable Long DiretorId,
                            @PathVariable Long OrdemId) {
        service.updateNotas(DiretorDto, DiretorId, OrdemId);
    }

    @GetMapping("/ordem-diretor/{selecaoId}")
    @ResponseStatus(HttpStatus.OK)
    public FilmesDto studentGrades(@PathVariable Long selecaoId) {
        return service.getselecaodiretor(ordemId);
    }
}
