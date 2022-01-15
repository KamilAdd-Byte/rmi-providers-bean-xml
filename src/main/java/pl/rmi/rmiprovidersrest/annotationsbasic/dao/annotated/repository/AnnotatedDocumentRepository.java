package pl.rmi.rmiprovidersrest.annotationsbasic.dao.annotated.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.rmi.rmiprovidersrest.annotationsbasic.dao.DocumentDao;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.impl.MySearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;

import java.util.ArrayList;
import java.util.List;

@Repository("documentDao")
public class AnnotatedDocumentRepository implements DocumentDao {


    private MySearchEngine mySearchEngine = new MySearchEngine();

    @Override
    public Document[] getAll() {
        return storage();
    }

    private Document[] storage() {
        List<Document> result = new ArrayList<>();

        Type type = new Type();
        type.setName("PDF");
        type.setDesc("Portable Document Format");
        type.setExtension(".pdf");

        Document document = new Document();
        document.setName("Algorytmy w przykładach");
        document.setType(type);

        result.add(document);

        return result.toArray(new Document[result.size()]);
    }
}
