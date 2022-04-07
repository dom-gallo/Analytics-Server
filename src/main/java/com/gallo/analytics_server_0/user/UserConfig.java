package com.gallo.analytics_server_0.user;


import com.gallo.analytics_server_0.domain.Domain;
import com.gallo.analytics_server_0.domain.PageView;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User user = new User("dgallo519@gmail.com", "passwordhash");
            List<PageView> views = new ArrayList<>();

            Domain domain = new Domain("getforgetmenot.com", views);
            PageView view = new PageView(LocalDateTime.now(), "/home");
            domain.getPageViews().add(view);
            user.setDomain(domain);
            repository.save(user);
        };
    }
}
