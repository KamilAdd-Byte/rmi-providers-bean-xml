package pl.rmi.rmiprovidersrest.annotationsbasic.model;

import lombok.*;

/** Klasa Type, określa typ dokumentu
 * [ENG] Class Type which specifies the type of document
 * Class has setters and getters and toString method - generated with Lombok
 * @see Document
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Type {
    private String name;// nazwa
    private String desc;// opis
    private String extension;// rozszerzenie
}
