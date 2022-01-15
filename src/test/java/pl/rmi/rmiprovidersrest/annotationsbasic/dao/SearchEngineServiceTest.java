package pl.rmi.rmiprovidersrest.annotationsbasic.dao;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchEngineServiceTest {

    private ClassPathXmlApplicationContext context;
    private SearchEngine engine;
    private Type odtType;

    @Before
    public void setup(){
        // definiujemy ścieżke path dla pliku konfiguracyjnego xml
        context = new ClassPathXmlApplicationContext("home/kamillodzinski/git_work/rmi-providers-rest/src/main/resources/mydocuments-context.xml");
        engine = context.getBean(SearchEngine.class);
        odtType = context.getBean("odtType",Type.class);
    }

    @Test
    void shouldFindDocumentByType() {
        List<Document> documents = engine.findByType(odtType);
        assertTrue(documents.size() == 1);
    }

    @Test
    void allDocuments() {
        List<Document> documents = engine.allDocuments();
        System.out.println(documents.size());
    }
}
