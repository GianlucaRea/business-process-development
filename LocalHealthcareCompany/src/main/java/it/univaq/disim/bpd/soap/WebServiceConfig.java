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
		return new ServletRegistrationBean<>(servlet, "/LocalHealthcareCompany/*");
	}

	@Bean(name = "localhealthcarecompany")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema localHealthcareCompanySchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("LocalHealthcareCompanyPort");
		wsdl11Definition.setLocationUri("/LocalHealthcareCompany");
		wsdl11Definition.setTargetNamespace("http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany");
		wsdl11Definition.setSchema(localHealthcareCompanySchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema localHealthcareCompanySchema() {
		return new SimpleXsdSchema(new ClassPathResource("LocalHealthcareCompanyMessages.xsd"));
	}
}
