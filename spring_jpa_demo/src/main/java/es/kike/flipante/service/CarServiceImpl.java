package es.kike.flipante.service;

import es.kike.flipante.data.entity.CarEntity;
import es.kike.flipante.data.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//This is the SERVICE CLASS IMPLEMENTATION
//Here we catch possible exceptions and defined Interface methods

//It is a @Service annotation
@Service
public class CarServiceImpl implements CarService { //Implements the Service Interface

////////THE BRIDGE
    //We first instantiate objects from our repositories to access to data
    @Autowired//@Autowired ease connections among services and repositories
    private final CarRepository carRepository;

    //Create a constructor ot the service implementation to be called by the APP
    //Input variable of this object is our data reository
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
////////////////

    //Developing Service Interface method 'save'...
    //A class that creates a new CarEntity from a given CarEntity
    public CarEntity save(CarEntity entity) {
        if (entity.getId() != null) {
            throw new RuntimeException("The id has to be null, due to it is autoincremental");
        }
        //Method '.save()' applied to a JPA Repository
        return this.carRepository.save(entity);
    }

    //Developing Service Interface method 'findAll'...
    //A class that creates a List of CarEntities via JPA Repository method '.findAll()'
    public List<CarEntity> findAll() {
        return this.carRepository.findAll();
    }
}
