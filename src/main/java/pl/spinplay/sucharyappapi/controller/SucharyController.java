package pl.spinplay.sucharyappapi.controller;


import pl.spinplay.sucharyappapi.model.Suchary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/suchary")
public class SucharyController {

    private List<Suchary> suchary = Arrays.asList(
            new Suchary("Ile zarabia mechanik samochody? Cztery koła", 1),
            new Suchary("Co pije Capitan? Capitana Morgana", 2),
            new Suchary("Ulubiona zupa rybaka? Rybna", 3)

    );

    @GetMapping("/random")
    public Suchary getRandomSuchar() {
        Random rand = new Random();
        return suchary.get(rand.nextInt(suchary.size()));
    }

    @GetMapping
    public List<Suchary> getAllSuchary() {
        return suchary;
    }

    @GetMapping("/{id}")
    public Suchary getSucharById(@PathVariable int id) {
        return suchary.stream()
                .filter(suchar -> suchar.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
