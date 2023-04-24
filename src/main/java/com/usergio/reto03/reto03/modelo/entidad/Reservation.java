package com.usergio.reto03.reto03.modelo.entidad;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="reservation")


public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";

    @ManyToOne
    @JoinColumn(name = "carId") //llave foranea
    @JsonIgnoreProperties("reservations")
    private Car car;


    @ManyToOne
    @JoinColumn(name = "clientId") //llave foranea
    @JsonIgnoreProperties({"reservations" , "messages"})
    private Client client;


    @OneToOne(cascade = {CascadeType.PERSIST}, mappedBy ="reservation" )
    @JsonIgnoreProperties("reservations")
    private Score score;

}
