package com.gallo.analytics_server_0.user;

import com.gallo.analytics_server_0.domain.Domain;
import com.gallo.analytics_server_0.domain.PageView;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class UserService {

    public UserService(){}

    public User getUser() {
        User user = new User("Dom Gallo", "dgallo519@gmail.com");
        user.setId(23L);
        Domain domain = new Domain("getforgetmenot.com", user.getId(), new ArrayList<PageView>());
        domain.setId(54L);
        PageView view = new PageView(LocalDateTime.now(), domain.getId(), "/home");
        domain.getPageViews().add(view);
        user.setDomain(domain);

        return user;
    }
}
