package pl.rmi.rmiprovidersrest.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import pl.rmi.rmiprovidersrest.service.HerbsService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * RMI
 */
public class RmiServiceExporterExample {

    /** Remote Method Invocation - Wystawienie usługi
     * Bean w roli adaptera. Pośredniczy w żądaniach kierowanych do klasy usługi:
     * @see pl.rmi.rmiprovidersrest.service.impl.HerbsServiceImpl
     * @param herbsService mój service dla klasy herb (interfejs)
     * @return wystawiona usługa RMI
     */
    @Bean
    @Deprecated
    public RmiServiceExporter rmiServiceExporter(HerbsService herbsService){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(herbsService);
        rmiServiceExporter.setServiceName("HerbService");
        rmiServiceExporter.setServiceInterface(HerbsService.class);
        //dowiązanie usługi do rejestru RMI na porcie 1199 i adresie rmi.herbs.pl
        rmiServiceExporter.setRegistryHost("rmi.herbs.pl");
        rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }

    /** Remote Method Invocation - Klienty RMI odszukują usługę w rejestrze RMI
     * Wyjątki kontrolowane
     * @return referencja do usługi RMI
     */
    public HerbsService rmiBinding(){
        HerbsService herbsService = null;
        try {
            String serviceUrl = "rmi:/herbs/HerbService";
            herbsService = (HerbsService) Naming.lookup(serviceUrl);
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e) {
            e.printStackTrace();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return herbsService;
    }

}
