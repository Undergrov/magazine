package com.magazine.market.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Location {
    private String country;
    private String region;
    private String city;
    private String street;

}
