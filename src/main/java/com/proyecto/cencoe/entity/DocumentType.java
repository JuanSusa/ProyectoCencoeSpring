package com.proyecto.cencoe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "document_type")
public class DocumentType implements Serializable {

    //el serial empieza en 1
    private static final Long serialVersionUID=1L;
    
    @Column(name = "doctype_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctypeId;
    
    @Column(name = "doctype_name")
    private String doctypeName;



}
