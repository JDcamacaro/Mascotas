package Controller;

import org.springframework.web.bind.annotation.RestController;
import Model.Mascota;
import Services.Servi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/mascotas")


public class Controller {

    @Autowired
    Servi servi;

    @GetMapping()
    public List<Mascota> findAll() {
        return servi.showMascotas();
    }

    @GetMapping("/{id}")
    public Mascota byId(@RequestParam Integer id) {
        return servi.byIdMascotas(id);    
    }

    @PostMapping
    public Mascota addMascota(@RequestBody Mascota mascota){
        return servi.addMascota(mascota);
    }

    @DeleteMapping("/{id}")
    public void deleteMascota(@PathVariable Integer id){
        servi.deleteMascota(id);
    }





}
