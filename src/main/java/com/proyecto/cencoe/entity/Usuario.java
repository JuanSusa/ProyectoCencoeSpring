package com.proyecto.cencoe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class Usuario implements Serializable {

    private static final Long serialVersionUID = 1L;
    
    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    @JoinColumn(name = "user_doctype")
    @ManyToOne(fetch = FetchType.LAZY)//carga tardia, si no hay relacion se totea
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})//especificaion del LAZY
    private DocumentType userDoctype;

    @Column(name = "user_numdoc")
    private String userNumdoc;

    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "user_lastname")
    private String userLastname;
    
    @Column(name = "user_address")
    private String userAddress;
    
    @Column(name = "user_phone")
    private String userPhone;
    
    @Column(name = "user_email")
    private String userEmail;
    
    @Column(name = "user_password")
    private String userPassword;
    
    /*@Column(name = "user_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userDate;*/

    @Column(name = "user_state")
    private Boolean userState;
}
