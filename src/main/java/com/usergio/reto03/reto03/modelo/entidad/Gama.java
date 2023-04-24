package com.usergio.reto03.reto03.modelo.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="gama")

public class Gama implements Serializable {
    // primary key  IdGama
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGama;
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gama")

    @JsonIgnoreProperties("gama")

    private List<Car> cars;



}
