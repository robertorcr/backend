package com.example.capacitacionpreuba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicicletasRepository extends JpaRepository<Bicicletas,Long>{
    
    Bicicletas findByDataBikesId(String biciId);

}
