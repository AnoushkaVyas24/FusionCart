package com.project.FusionCart.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    private String street;

    @NotBlank
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City name must contain atleast 4 characters")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State name must contain atleast 2 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Country name must contain atleast 2 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Pincode must contain atleast 6 characters")
    private String pincode;

    @ManyToMany(mappedBy = "address")
    private List<User> user = new ArrayList<>();

    public Address(Long addressId, String street, String buildingName, String city, String state, String country, String pincode, List<User> user) {
        this.addressId = addressId;
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.user = user;
    }
}
