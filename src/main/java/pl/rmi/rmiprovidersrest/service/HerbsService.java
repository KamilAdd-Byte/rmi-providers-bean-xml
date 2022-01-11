package pl.rmi.rmiprovidersrest.service;

import org.springframework.stereotype.Service;
import pl.rmi.rmiprovidersrest.model.Herb;
import java.util.List;

@Service("herbs")//kontener utworzy ziarno o identyfikatorze 'herbs'
public interface HerbsService {
    List<Herb> allHerbs();
    void addHerb(Herb herb);
    void removeHerb(Herb herb);
    Herb getHerbById(int id);
}
