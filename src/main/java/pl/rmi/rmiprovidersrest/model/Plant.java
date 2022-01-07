package pl.rmi.rmiprovidersrest.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public abstract class Plant {
    private String name;
    private String type;
}
