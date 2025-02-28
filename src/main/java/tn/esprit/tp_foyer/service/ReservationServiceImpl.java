package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Reservation;
import tn.esprit.tp_foyer.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class ReservationServiceImpl implements IReservationService{

    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }


    @Override
    public Reservation retrieveReservation(String id) {
        return reservationRepository.findById(id).isPresent() ? reservationRepository.findById(id).get() : null;
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(String id) {
        reservationRepository.deleteById(id);
    }
}
