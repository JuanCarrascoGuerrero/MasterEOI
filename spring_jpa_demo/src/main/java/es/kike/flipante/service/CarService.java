package es.kike.flipante.service;

import es.kike.flipante.data.entity.CarEntity;

import java.util.List;

//SERVICE is the code bridge between Data REPOSITORIES and the runnable APP
//Here we implement APP methods (Interface) and catch possible exceptions (Implementation class)


// This is the Interface
public interface CarService {

    //Methods just have to be instantiated

    //Method that saves an object CarEntity named entity (on the connected DDBB, for example)
    CarEntity save(CarEntity entity);

    //Method that finds all appearances asked via pre storage in a List
    List<CarEntity> findAll();
}
