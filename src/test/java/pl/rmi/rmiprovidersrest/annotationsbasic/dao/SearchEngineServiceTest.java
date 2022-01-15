package pl.rmi.rmiprovidersrest.annotationsbasic.dao;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchEngineServiceTest {

    private ClassPathXmlApplicationContext context;
    private SearchEngine engine;
    private Type odtType;

    @BeforeEach
    public void setup(){
        // definiujemy ścieżke path dla pliku konfiguracyjnego xml
        context = new ClassPathXmlApplicationContext("resources/mydocuments-context.xml");
        engine = context.getBean(SearchEngine.class);
        odtType = context.getBean("odtType",Type.class);
    }

    @Test
    void shouldFindDocumentByType() {
        Resource resource = context.getResource("../src/main/resources/documents/annotations_spring.txt");

        try {
            InputStream inputStream = resource.getInputStream();
            Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNext()){
                    System.out.println(scanner.nextLine());
                }
                scanner.close();
                inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    void allDocuments() {
        List<Document> documents = engine.allDocuments();
        System.out.println(documents.size());
    }
}
