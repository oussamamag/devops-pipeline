package tn.esprit.devopspipeline.restcontrollers;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.devopspipeline.entities.Skieur;
import tn.esprit.devopspipeline.services.ISkieurService;

import java.util.List;
@RestController
@AllArgsConstructor
public class SkieurRestController {
private ISkieurService skieurService;
    @PostMapping("/add")
    public Skieur addSkier(@RequestBody Skieur skier){
        return  skieurService.addSkier(skier);
    }

    @GetMapping("/get/{id-skier}")
    public Skieur getById(@PathVariable("id-skier") Long numSkier){
        return skieurService.retrieveSkier(numSkier);
    }


    @DeleteMapping("/delete/{id-skier}")
    public void deleteById(@PathVariable("id-skier") Long numSkier){
        skieurService.removeSkier(numSkier);
    }


    @GetMapping("/all")
    public List<Skieur> getAllSkiers(){
        return skieurService.retrieveAllSkiers();
    }

}
