package configuration;


import com.example.MessageService;
import com.example.MyNameMessageService;
import com.example.RandomTextMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean
    @Primary
    public MessageService myNameMessageServiceConfiguration(){
        return new MyNameMessageService();
    }

    @Bean

    public MessageService randomTextMessageServiceConfiguration(){
        return new RandomTextMessageService();
    }

}
