package pl.rmi.rmiprovidersrest.annotationsbasic.dao;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class SearchEngineService implements SearchEngine {
    @Autowired
   private DocumentDao documentDao;

    public SearchEngineService() {
        if (log.isDebugEnabled())
            log.debug("Utworzono egzemplarz klasy ServiceSearchEngine: " + this);
    }

    /**
     * @param documentType a class object that is not null
     * @return documents list by type if exist
     */
    @Override
    public List<Document> findByType(Type documentType) {
        List<Document> result = new ArrayList<>();
        for (Document document : allDocuments()) {
            if (document.getType().getName().equals(documentType.getName())){
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public List<Document> allDocuments() {
        return Arrays.asList(documentDao.getAll());
    }

    public DocumentDao getDocumentDao() {
        return documentDao;
    }

    public void setDocumentDao(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }
}
