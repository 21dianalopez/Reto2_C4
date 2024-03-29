
package Reto_2_C4.Repositorio;

import Reto_2_C4.Interface.interfaceUser;
import Reto_2_C4.Modelo.User;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositorio {
    
    @Autowired
    private interfaceUser crud;
    
    public List<User> getAll(){
        return (List<User>) crud.findAll();
    }
    
    public Optional<User> getUser(int id){
        return crud.findById(id);
    }
    
    public boolean existeEmail(String email){
            Optional<User> usuario = crud.findByEmail(email);
            return  !usuario.isEmpty();
    }
    
    public User getExistsEmailAndPassword(String email, String password){
        return crud.findAllByEmailAndPassword(email, password);
    }
    
    public User save(User user){
        return crud.save(user);
    }
    
    public void delete(User user){
        crud.delete(user);
    }
    
    /*
    public Optional<User> getFindByEmail(String user) {
        return crud.findByEmail(String user);
    }
    */
    
}
