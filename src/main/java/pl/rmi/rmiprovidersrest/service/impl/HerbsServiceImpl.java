package pl.rmi.rmiprovidersrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.rmi.rmiprovidersrest.model.Herb;
import pl.rmi.rmiprovidersrest.repository.HerbsRepository;
import pl.rmi.rmiprovidersrest.service.HerbsService;

import java.util.List;

public class HerbsServiceImpl implements HerbsService {

    @Autowired
    HerbsRepository herbsRepository;

    @Override
    public List<Herb> allHerbs() {
        return this.herbsRepository.findAll();
    }

    @Override
    public void addHerb(Herb herb) {
        this.herbsRepository.save(herb);
    }

    @Override
    public void removeHerb(Herb herb) {
    this.herbsRepository.delete(herb);
    }

    @Override
    public Herb getHerbById(int id) {
        return this.herbsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Herb with given id does not exist"));
    }
}
