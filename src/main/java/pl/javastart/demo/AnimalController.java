package pl.javastart.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class AnimalController {
    private  AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }


    @GetMapping("/")
    public String home(Model model){
        Set<Animal> animals = animalRepository.findAll();
        model.addAttribute("animals", animals);
        return "home";
    }

    @GetMapping("/zwierzak")
    public String details(@RequestParam String imie, Model model){

        Animal animal = animalRepository.findByName(imie);

        if (animal != null){
            model.addAttribute("animal", animal);
//            model.addAttribute("name", animal.getName());
//            model.addAttribute("description", animal.getDescription());
            return "animal"; // -> /reaources/templates/animal.html
        }else{
            return "redirect:/";
        }
    }
}
