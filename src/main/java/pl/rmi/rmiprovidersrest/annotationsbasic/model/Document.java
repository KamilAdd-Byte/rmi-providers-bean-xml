package pl.rmi.rmiprovidersrest.annotationsbasic.model;

import lombok.*;

import java.util.Date;

/** Główna klasa modelu, zawiera pola potrzebne dla dokumentu
 * [ENG] Main class of model, containing the all fields for the document

 * Class has setters and getters and toString method - generated with Lombok
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Document {
    private String name;
    private Type type;
    private String location;
    private Date created;
    private Date modified;
}
