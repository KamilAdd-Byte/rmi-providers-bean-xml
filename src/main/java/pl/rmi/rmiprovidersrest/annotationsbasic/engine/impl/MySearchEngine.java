package pl.rmi.rmiprovidersrest.annotationsbasic.engine.impl;

import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.ArrayList;
import java.util.List;

/** Repozytorium, szablon, podejście z lista na sztywno - storage();
 * [ENG] A rigid approach from the list
 */
public class MySearchEngine implements SearchEngine {

    /**
     * @param documentType a class object that is not null
     * @return documents list by type if exist
     *
     * iterating over initialized list in storage()
     */
    @Override
    public List<Document> findByType(Type documentType) {
        List<Document> result = new ArrayList<>();
        for (Document document : storage()) {
            if (document.getType().getName().equals(documentType.getName())){
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public List<Document> allDocuments() {
        return storage();
    }

    private List<Document> storage() { // storage - przechowywanie
        List<Document> result = new ArrayList<>();

        // utworzenie klasy Type
        Type type = new Type();
        type.setName("PDF");
        type.setDesc("Portable Document Format");
        type.setExtension(".pdf");

        // utworzenie klasy Document
        Document document = new Document();
        document.setName("Spring. Podstawy");
        document.setType(type);

        result.add(document);

        return result;
    }
}
