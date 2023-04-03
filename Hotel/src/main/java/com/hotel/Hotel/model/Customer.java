package com.hotel.Hotel.model;

import jakarta.persistence.*;
import jakarta.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
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

        public Customer(int id, String name, String address, int ph, String email) {
                this.id = id;
                this.name = name;
                this.address = address;
                this.ph = ph;
                this.email = email;
        }

        public Customer(String name, String address, int ph, String email) {
                this.name = name;
                this.address = address;
                this.ph = ph;
                this.email = email;
        }

        public Customer() {
        }


}
