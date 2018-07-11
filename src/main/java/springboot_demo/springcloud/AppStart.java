package springboot_demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class AppStart {
	
    public static void main( String[] args )
    {
    	SpringApplication.run(AppStart.class, args);
    }
}
