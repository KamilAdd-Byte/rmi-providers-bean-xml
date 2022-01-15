package pl.rmi.rmiprovidersrest.annotationsbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.rmi.rmiprovidersrest.annotationsbasic.dao.DocumentDao;
import pl.rmi.rmiprovidersrest.annotationsbasic.dao.SearchEngineService;
import pl.rmi.rmiprovidersrest.annotationsbasic.engine.SearchEngine;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyDocumentContext {
    private Map<String, Document> documents = new HashMap<>();
    private Map<String, Type> types = new HashMap<>();

    @Autowired
    DocumentDao documentDao;

    @Bean
    public Type webType(){
        return getTypeFromMap("web");
    }

    private Type getTypeFromMap(String web) {
    }

    @Bean
    @Scope("prototype")
    public SearchEngine engine(){
        SearchEngineService engineService = new SearchEngineService();
        engineService.setDocumentDao(documentDao);
        return engineService;
    }
}
