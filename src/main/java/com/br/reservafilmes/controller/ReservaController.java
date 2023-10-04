package main.java.com.br.reservafilmes.controller;

import com.br.reservafilmes.entity.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reserva> create(@RequestBody Reserva reserva) {
        Reserva reservaCreated = service.create(reserva);

        return ResponseEntity.status(201).body(reservaCreated);
    }

    @GetMapping("/reserva/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reserva> getByReservaId(@PathVariable Long id) {
        return service.getByReservaId(id);
    }

}
