package com.backendlld.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Region extends BaseModel{
    private String name;
//    private List<Theatre> theatreList;
}