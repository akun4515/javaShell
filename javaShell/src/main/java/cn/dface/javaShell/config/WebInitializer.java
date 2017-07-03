package cn.dface.javaShell.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
			AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
			ctx.register(MyWebMvcConfig.class);
			ctx.setServletContext(servletContext);
			Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
			servlet.addMapping("/");
			servlet.setLoadOnStartup(1);
			servlet.setAsyncSupported(true);
	}
	
}
