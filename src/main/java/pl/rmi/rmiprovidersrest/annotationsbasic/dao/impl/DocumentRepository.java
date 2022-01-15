package pl.rmi.rmiprovidersrest.annotationsbasic.dao.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.rmi.rmiprovidersrest.annotationsbasic.dao.DocumentDao;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class DocumentRepository implements DocumentDao {

    private Document doc1;
    private Document doc2;
    private Document doc3;
    private Document doc4;

    @Override
    public Document[] getAll() {
        return new Document[]{doc1, doc2, doc3, doc4};
    }
}
