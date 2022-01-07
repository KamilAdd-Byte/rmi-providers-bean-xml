package pl.rmi.rmiprovidersrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rmi.rmiprovidersrest.model.Herb;

@Repository
public interface HerbsRepository extends JpaRepository<Herb,Integer> {
}
