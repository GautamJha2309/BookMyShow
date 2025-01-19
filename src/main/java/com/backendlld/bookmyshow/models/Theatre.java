package com.backendlld.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
    //    Theatre 1 : M Screen
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private Region region;

}
