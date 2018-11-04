package swiki.mainapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class MakeupObsessionMain extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MakeupObsessionMain.class);
    }
	
	public static void main(String[] args) {
		System.out.print("1");
		SpringApplication.run(MakeupObsessionMain.class, args);
	}
}
