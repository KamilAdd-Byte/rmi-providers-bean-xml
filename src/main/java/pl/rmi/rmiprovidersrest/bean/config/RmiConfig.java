package pl.rmi.rmiprovidersrest.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import pl.rmi.rmiprovidersrest.service.HerbsService;

public class RmiConfig {

    /**
     * Komponent-fabryka Springa RmiProxyFactoryBean tworzy obiekt pośrednika dla usługi RMI.
     * @return obiekt posrednik dla usługi RMI
     * @deprecated there are newer solutions
     */
    @Bean
    public RmiProxyFactoryBean herbService(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost/HerbService");
        rmiProxyFactoryBean.setServiceInterface(HerbsService.class);

        return rmiProxyFactoryBean;
    }
}
