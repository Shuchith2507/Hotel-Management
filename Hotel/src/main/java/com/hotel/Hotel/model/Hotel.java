package com.hotel.Hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name="Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private int ph;
    @Column(name="email")
    private String email;
    @Column(name="rating")
    private int rating;

    public Hotel(String name, String address, int ph, String email, int rating) {
        this.name = name;
        this.address = address;
        this.ph = ph;
        this.email = email;
        this.rating = rating;
    }

    public Hotel(int id, String name, String address, int ph, String email, int rating) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph = ph;
        this.email = email;
        this.rating = rating;
    }

    public Hotel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
