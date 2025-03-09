package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//Repositories runnable with JPA Spring Boot facilities

                                        //Extending runnable class and passing it <Data object, ID type>
public interface CarRepository extends JpaRepository<CarEntity, Integer> {
}
