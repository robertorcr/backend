package com.example.capacitacionpreuba;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/bicicletas")
public class BicicletasController {

    @Autowired
    private BicicletasRepository bicisRepositorio;


    @GetMapping("/todas")
    public ResponseEntity<List<Bicicletas>> traeMisBicicletas(){
        List<Bicicletas> cletas = bicisRepositorio.findAll();
        return ResponseEntity.ok().body(cletas);
    }

    @GetMapping("/simple/{id}")
    public ResponseEntity<Bicicletas> getBicicletas(@PathVariable(value="id") String biciID) {
        Bicicletas bicis = bicisRepositorio.findByDataBikesId(biciID);
        return ResponseEntity.ok().body(bicis);
    }

    @PostMapping("/guarda")
    public ResponseEntity<Object> guardBicicletas(@RequestBody Bicicletas Bici){
        bicisRepositorio.save(Bici);
        return ResponseEntity.ok().build();
    }    
}
