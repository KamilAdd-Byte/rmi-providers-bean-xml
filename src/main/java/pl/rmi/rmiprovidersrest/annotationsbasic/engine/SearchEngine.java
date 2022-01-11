package pl.rmi.rmiprovidersrest.annotationsbasic.engine;

import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.List;

/** Główny interfejs. Usługa zwraca wszystkie dokumenty oraz dokumnety po typie
 * @see Type
 */
public interface SearchEngine {

    /**
     * @param documentType a class object that is not null
     * @return documents list by type if exist
     */
    List<Document> findByType (Type documentType);
    List<Document> allDocuments();
}
