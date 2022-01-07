package pl.rmi.rmiprovidersrest.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Month;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Herb extends Plant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Month dateOfSow;
}
