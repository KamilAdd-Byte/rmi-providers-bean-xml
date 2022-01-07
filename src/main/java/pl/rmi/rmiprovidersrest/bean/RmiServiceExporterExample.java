package pl.rmi.rmiprovidersrest.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import pl.rmi.rmiprovidersrest.service.HerbsService;

public class RmiServiceExporterExample {

    /** Remote Method Invocation
     * Bean w roli adaptera. Pośredniczy w żądaniach kierowanych do klasy usługi:
     * @see pl.rmi.rmiprovidersrest.service.impl.HerbsServiceImpl
     * @param herbsService mój service dla klasy herb (interfejs)
     * @return usługa RMI
     */
    @Bean
    @Deprecated
    public RmiServiceExporter rmiServiceExporter(HerbsService herbsService){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(herbsService);
        rmiServiceExporter.setServiceName("Herbs service");
        rmiServiceExporter.setServiceInterface(HerbsService.class);
        return rmiServiceExporter;
    }
}
