package com.backendlld.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "users")
public class User extends BaseModel {
    private String firstName;
    private String lastName;
    private String name;
    private String email;
    private String password;
    @OneToMany
    private List<Booking> bookings;

}
