package Reto_2_C4.Interface;


import Reto_2_C4.Modelo.clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface interfaceClothe extends MongoRepository<clothe, String> {
    //Lo utilizo porque con findById siempre me devuelve null
   //Optional<Clothe> findByReference(String reference);
    
}
