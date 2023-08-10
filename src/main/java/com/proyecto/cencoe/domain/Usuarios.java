package com.proyecto.cencoe.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Entity //anotacion para convertir la clase en una entidad
@Data //anotacion para crear los metodos ToString, EqualsAndHashCode, Getter/Setter 
@Table(name="usuarios") //anotacion que sirve para renombrar clase con db
public class Usuarios implements Serializable {
    
    private static final long serialVersionUID = 1L;//codigo byte 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//establecemos primaryKey en bd
    private Long idUsuario;//id en bd
    
    @Column
    @NotBlank(message="Este campo es obligatorio")
    @Size(max = 100, message = "El campo no puede mas de 100 caracteres")
    private String nomUsuario;
    
    @Column
    private String apellidoUsuario;
    
    @Column
    private String passUsuario;
    
    @Column
    private String direUsuario;
    
    @Column
    private String emailUsuario;
}
