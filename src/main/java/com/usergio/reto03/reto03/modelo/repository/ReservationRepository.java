package com.usergio.reto03.reto03.modelo.repository;

import com.usergio.reto03.reto03.modelo.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
