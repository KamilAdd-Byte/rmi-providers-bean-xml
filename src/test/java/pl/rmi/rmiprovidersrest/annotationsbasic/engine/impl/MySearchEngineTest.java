package pl.rmi.rmiprovidersrest.annotationsbasic.engine.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MySearchEngineTest {

    private final SearchEngine engine = new MySearchEngine();

    @Test
    @DisplayName("should find document by type")
    void shouldFindDocumentByType() {
        //given
        Type documentType = createNewType();

        //when
        List<Document> documents = engine.findByType(documentType);

        //then
        //assertj
        assertThat(documentType).isNotNull();
        assertThat(documents.size()).isEqualTo(1);
        //junit assert
        assertNotNull(documents); //junit assert
        Assertions.assertTrue(documents.size() == 1);
        Assertions.assertEquals(documentType.getDesc(),documents.get(0).getType().getDesc());
        Assertions.assertEquals(documentType.getExtension(),documents.get(0).getType().getExtension());

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
