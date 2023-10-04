package main.java.com.br.reservafilmes.service;


import com.br.reservafilmes.entity.Reserva;
import com.br.reservafilmes.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository repository;

    public Reserva create(Reserva reserva) {
        return repository.save(reserva);
    }

    public List<Reserva> getByReservaId(Long generoId) {

        return repository.findByGeneroId(filmeId);

    }
}
