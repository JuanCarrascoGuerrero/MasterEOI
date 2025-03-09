package es.kike.flipante;

import es.kike.flipante.data.entity.CarEntity;
import es.kike.flipante.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//Enable specific beans (Object storage), scanners and SpringXML to run the APP
@EnableAutoConfiguration
public class KikeApplication implements CommandLineRunner {//Interface containing APP running methods

    //Logger is the message printing and storing class for APPs
    private static Logger logger = LoggerFactory.getLogger(KikeApplication.class);


//Here comes the APP main that runs the whole program
    public static void main(String[] args) {
        SpringApplication.run(KikeApplication.class, args);
    }


    @Autowired //Linking SERVICE (linked to DATA) and APP...
    private CarService service; //...instantiating an object from the Service Implemntation


    //Method to run service methods
    @Override//@notation sometimes required to check compilation times
    public void run(String... args) {
        logger.info("Recuperando datos de coches");//Call to Logger to sout(message)

        //findAll() and collect into stream to be printed via Lambda expression
        service.findAll().stream().forEach(e -> logger.info(e.getPlate()));
        //save()
        service.save(new CarEntity());
    }
}