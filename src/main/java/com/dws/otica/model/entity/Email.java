package com.dws.otica.model.entity;
// Generated 04/04/2017 21:28:55 by Hibernate Tools 4.3.1



/**
 * Email generated by hbm2java
 */
public class Email  implements java.io.Serializable {


     private Integer idEmail;
     private Cliente cliente;
     private String email;

    public Email() {
    }

    public Email(Cliente cliente, String email) {
       this.cliente = cliente;
       this.email = email;
    }
   
    public Integer getIdEmail() {
        return this.idEmail;
    }
    
    public void setIdEmail(Integer idEmail) {
        this.idEmail = idEmail;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


