package Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Mascota;
import Repository.ModelRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Servi {

    @Autowired
    ModelRepository modelRepository;


    public List<Mascota> showMascotas(){
        return modelRepository.findAll();
    }

    public Mascota byIdMascotas(Integer id){
        return modelRepository.findById(id).get();
    }

    public Mascota addMascota(Mascota mascota){
        return modelRepository.save(mascota);
    }

    public void deleteMascota(Integer id){
        modelRepository.deleteById(id);
    }






    
}
