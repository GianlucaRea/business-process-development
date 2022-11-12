package it.univaq.disim.bpd.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/RegistryOffice/*");
	}

	@Bean(name = "registryoffice")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema registryOffice) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("RegistryOfficePort");
		wsdl11Definition.setLocationUri("/RegistryOffice");
		wsdl11Definition.setTargetNamespace("http://eu.chorevolution.farmbusinessstartup/registryoffice");
		wsdl11Definition.setSchema(registryOffice);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema registryOfficeSchema() {
		return new SimpleXsdSchema(new ClassPathResource("RegistryOfficeMessages.xsd"));
	}
}
