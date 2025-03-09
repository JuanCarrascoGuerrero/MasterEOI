package es.kike.flipante.data.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractVehicle { //Schema abstract for entities

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(Id) primary key attribute is generated

    //Attributes in entities are private and...
    private Integer id;
    private String brand;
    private String model;

    //...have ti generate Getters and Setters to access their values
    //Empty constructor is implicit when declaring
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
