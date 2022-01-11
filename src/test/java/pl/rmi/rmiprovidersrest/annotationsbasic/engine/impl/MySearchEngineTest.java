package pl.rmi.rmiprovidersrest.annotationsbasic.engine.impl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MySearchEngineTest {

    private final SearchEngine engine = new MySearchEngine();

    @Test
    void shouldFindDocumentByType() {
        //given
        Type documentType = createNewType();

        //when
        List<Document> documents = engine.findByType(documentType);

        //then
        assertThat(documentType).isNotNull();

    }

    private Type createNewType() {
        Type documentType = new Type();
        documentType.setName("PDF");
        documentType.setDesc("Portable Document Format");
        documentType.setExtension(".pdf");
        return documentType;
    }

    @Test
    void allDocuments() {
    }
}
