package customer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableCaching
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}
	
	 private static Class<Application> applicationClass = Application.class;

		// EhCache Manager
		@Primary
		@Bean
		public CacheManager ehCacheManager() {
			return new EhCacheCacheManager(ehCacheCacheManager().getObject());
		}
		
		@Bean
		public EhCacheManagerFactoryBean ehCacheCacheManager() {
			EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
			cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
			cmfb.setShared(true);
			return cmfb;
		}
	 
}

@RestController
class CustomerController {
	
	@Autowired
	  private CustomerRepository repository;

    @RequestMapping("/customer/{lastName}")
    List<Customer> getCustomer(@PathVariable String lastName) {
   	 
   	 List<Customer> findAll = (List<Customer>) repository.findAll();
   	 
   	List<Customer> foundByLastName = repository.findByLastName(lastName);
   	 
        return foundByLastName;
    }
    
}
