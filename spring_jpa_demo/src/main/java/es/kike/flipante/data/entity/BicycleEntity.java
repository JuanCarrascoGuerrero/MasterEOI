package es.kike.flipante.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//This is an @Entity named "BICYCLE"
@Entity
@Table(name = "BICYCLE")
public class BicycleEntity extends AbstractVehicle { //Extends the abstract Schema common to both entities

    //Attributes, Getters&Setters and implicit empty constructor
    private Integer wheelsNumber;

    public Integer getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(Integer wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }
}
