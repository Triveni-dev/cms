package com.triveni.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    //to customize customer inputfields to client we can use
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int customerid;

    @JsonProperty("firstname")
    private String customerfirstname;
    @JsonProperty("lastname")
    private String customerlastname;
    @JsonProperty("email")
    private String customeremail;

    public Customer(){

    }

    public Customer(int customerid, String customerfirstname, String customerlastname, String customeremail) {
        this.customerid = customerid;
        this.customerfirstname = customerfirstname;
        this.customerlastname = customerlastname;
        this.customeremail = customeremail;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }
}
