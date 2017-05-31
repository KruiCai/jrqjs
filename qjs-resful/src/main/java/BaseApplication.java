
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by krui on 2017/05/23.
 */
@SpringBootApplication
@MapperScan("com.jr.qjs.mapper")
@ComponentScan("com.jr.qjs")
public class BaseApplication {
    protected final static Logger logger = LoggerFactory.getLogger(BaseApplication.class);
    public static void main( String[] args )
    {
//        SpringApplication app = new SpringApplication(BaseApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(BaseApplication.class, args);
//        logger.info("PortalApplication is sussess!");
//        System.err.println("sample started. http://localhost:8080/user/test");


        //SpringApplication.run(BaseApplication.class, args);
    }



}
