package com.proyecto.cencoe.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;



@Entity //anotacion para convertir la clase en una entidad
@Data //anotacion para crear los metodos ToString, EqualsAndHashCode, Getter/Setter 
@Table(name="usuarios") //anotacion que sirve para renombrar clase con db
public class Usuarios implements Serializable {
    
    private static final long serialVersionUID = 1L;//codigo byte 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//establecemos primaryKey en bd
    private Long idUsuario;//id en bd
    
    private String nomUsuario;
    private String apellidoUsuario;
    private String passUsuario;
    private String direUsuario;
    private String emailUsuario;
}
