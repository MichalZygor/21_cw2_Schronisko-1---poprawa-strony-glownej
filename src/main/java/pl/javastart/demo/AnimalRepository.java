package pl.javastart.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;

    public AnimalRepository(){
        animals = new HashSet<>();
        animals.add(new Animal("Azor", "Azor to super piesek", "https://www.pieski.net/psy/d/smutny-piesek-1.jpeg"));
        animals.add(new Animal("Rudy", "Rudy kocur chodzi swoimi ścieżkami", "/kot.jpg"));
        animals.add(new Animal("Osiołek", "Rudy kocur chodzi swoimi ścieżkami", ""));
        animals.add(new Animal("fifi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis non elit nec urna rutrum dignissim eu quis neque. Aliquam dignissim sagittis ultrices. Suspendisse nec diam varius felis fringilla ullamcorper sed eget dui.", ""));
        animals.add(new Animal("kusia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis non elit nec urna rutrum dignissim eu quis neque. Aliquam dignissim sagittis ultrices. Suspendisse nec diam varius felis fringilla ullamcorper sed eget dui.", ""));
        animals.add(new Animal("madzia", "Nulla varius et libero in ullamcorper. Aliquam sagittis ex quis metus scelerisque lacinia. Sed congue libero tortor, eu mollis lorem lobortis et. i", ""));
        animals.add(new Animal("lodzia", "Rudy Nulla varius et libero in ullamcorper. Aliquam sagittis ex quis metus scelerisque lacinia. Sed congue libero tortor, eu mollis lorem lobortis et. i", ""));


    }

    public Animal findByName(String name){
        for(Animal animal : animals){
            if(animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }

    public Set<Animal> findAll() {
        return animals;
    }
}
