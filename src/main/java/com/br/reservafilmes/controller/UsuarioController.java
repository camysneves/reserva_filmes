package main.java.com.br.reservafilmes.controller;

import com.br.reservafilmes.entity.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario usuarioCreated = service.create(usuario);

        return ResponseEntity.status(201).body(usuarioCreated);
    }

    @GetMapping("/listar-usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Usuario> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "consulta-usuario/{id}")
    public List<Filme> cusultaListaUsuarios(@PathVariable Long id) {

        return service.buscarListaUsuarios(id);
    }

}
