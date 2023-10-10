package cm.uy1.custumerservice.config;

import org.apache.cxf.Bus;
import org.springframework.context.annotation.Configuration;

import cm.uy1.custumerservice.web.CustomerSoapService;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class CxfConfig {

    private Bus bus;
    private CustomerSoapService customerSoapService;

    // @Bean
    // public EndpointImpl endPoint() {
    // EndpointImpl endpoint = new EndpointImpl(bus, customerSoapService);
    // return endpoint;
    // }
}