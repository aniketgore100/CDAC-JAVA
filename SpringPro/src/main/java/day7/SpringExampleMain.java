package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringExampleMain  {

	public static void main(String[] args) {
		String configpath = "spring-config.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configpath);
	    
		Object obj = ctx.getBean("myBean2");
	    GreetingService gs = (GreetingService)obj;
	    String reply = gs.SayGreet();
	    
	    System.out.println(reply);
	    
	     obj = ctx.getBean("myBean3");
	     gs  = (GreetingService)obj;
	     reply = gs.SayGreet();
	     System.out.println(reply);
	}

}
