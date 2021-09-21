package pl.itpoznanski.crud_app_after_brake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.itpoznanski.crud_app_after_brake.entity.furniture;
import pl.itpoznanski.crud_app_after_brake.repository.furnitureRepo;

import java.util.Optional;

@Service
public class furnitureService {
    @Autowired
    furnitureRepo furnitureRepo;
    public Iterable<furniture>findAll(){
        return furnitureRepo.findAll();
    }
    public furniture save (furniture furniture){
        return furnitureRepo.save(furniture);
    }
    public Optional<furniture>findById(Integer id){
        return furnitureRepo.findById(id);
    }
    public void delete (furniture furniture){
        furnitureRepo.delete(furniture);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new furniture( "Oland", 90.0));
    }
}
