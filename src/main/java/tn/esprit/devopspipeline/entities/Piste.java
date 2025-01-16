package tn.esprit.devopspipeline.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Piste implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;
    int length;
    int slope;
}
