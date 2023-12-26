package day9;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMvcWebApplicationInitializer implements WebApplicationInitializer {
	//This class is used to configure Front Controller: DispatcherServlet to accept any request
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		WebApplicationContext webCtx = getContext();
		//Instantiating 'DispatcherServlet' based upon WebApplicationContext
		DispatcherServlet frontControllerServlet = 
				new DispatcherServlet(webCtx); 
		//Registering Front Controller: DispatcherServlet using 'ServletContext'
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("frontController", frontControllerServlet);
		/*
		 * The equivalent code in web.xml for DispatcherServlet registration
		 	<servlet>
		 		<servlet-name>frontController</servlet-name>
		 		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		 	</servlet>
		 */
		dispatcher.addMapping("/");//Configuring DispatcherServlet to accept any request
		/*
		 * The equivalent code in web.xml for DispatcherServlet URL configuration
		 	<servlet-mapping>
		 		<servlet-name>frontController</servlet-name>
		 		<url-pattern>/</url-pattern>
		 	</servlet-mapping>
		 */
	
		

	}
	
	private WebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocations("day9");//This tells Spring MVC to scan the base package: day9
		return webCtx;
	}
	
	

}
