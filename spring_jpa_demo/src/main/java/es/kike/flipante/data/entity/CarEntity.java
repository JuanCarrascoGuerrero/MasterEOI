package es.kike.flipante.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//This is an @Entity named "CAR"
@Entity
@Table(name = "CAR")
public class CarEntity extends AbstractVehicle { //Extends the abstract Schema common to both entities

    //Attributes, Getters&Setters and implicit empty constructor
    private String plate;
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
