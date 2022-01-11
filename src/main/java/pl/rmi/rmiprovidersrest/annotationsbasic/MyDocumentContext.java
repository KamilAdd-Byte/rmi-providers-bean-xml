package pl.rmi.rmiprovidersrest.annotationsbasic;

import org.springframework.context.annotation.Configuration;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Document;
import pl.rmi.rmiprovidersrest.annotationsbasic.model.Type;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyDocumentContext {
    private Map<String, Document> documents = new HashMap<>();
    private Map<String, Type> types = new HashMap<>();
    
//    @Bean
//    public Type webType(){
//        return getTypeFromMap("web");
//    }

//    private Type getTypeFromMap(String web) {
//    }
//
//    public SearchEngine engine(){
//
//    }
}
