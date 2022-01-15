package pl.rmi.rmiprovidersrest.annotationsbasic.dao.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rmi.rmiprovidersrest.annotationsbasic.dao.DocumentDao;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Adnotacja z wartością
 * Kontener springa utworzy ziarno o identyfikatorze engine
 */
@Service("engine")
public class AnnotatedSearchEngine implements SearchEngine {
    @Autowired
    private DocumentDao documentDao;

    /**
     * @param documentType a class object that is not null
     * @return documents list by type if exist
     */
    @Override
    public List<Document> findByType(Type documentType) {
       List<Document> result = new ArrayList<>();
        for (Document document : allDocuments()) {
            if (document.getType().getName().equals(documentType.getName()))
                result.add(document);
        }
        return result;
    }

    @Override
    public List<Document> allDocuments() {
        return Arrays.asList(documentDao.getAll());
    }
}
