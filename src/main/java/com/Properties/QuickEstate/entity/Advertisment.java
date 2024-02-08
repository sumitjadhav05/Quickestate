package com.Properties.QuickEstate.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Advertisment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    String title;
    
    String adsType;
    
    String description;
    
    @ManyToOne
    Owner owners;
    
    @OneToOne(mappedBy = "advertisment") // Bidirectional relationship, mapped by "advertisment" field in Property entity
    Property property;

    // Getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdsType() {
        return adsType;
    }

    public void setAdsType(String adsType) {
        this.adsType = adsType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Owner getOwner() {
        return owners;
    }

    public void setOwner(Owner owner) {
        this.owners = owner;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
