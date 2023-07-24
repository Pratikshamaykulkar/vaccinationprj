package com.example.vaccination_web.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="vaccinedetails")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String iddetails;
    private String idtype;
    private String name;
    private String contactnumber;
    private String vaccinename;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getIddetails() {
        return iddetails;
    }
    public void setIddetails(String iddetails) {
        this.iddetails = iddetails;
    }
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
    public String getVaccinename() {
        return vaccinename;
    }
    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", iddetails=" + iddetails + ", idtype=" + idtype + ", name=" + name
                + ", contactnumber=" + contactnumber + ", vaccinename=" + vaccinename + "]";
    }
}