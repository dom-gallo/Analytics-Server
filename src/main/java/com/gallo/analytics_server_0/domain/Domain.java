package com.gallo.analytics_server_0.domain;

import com.gallo.analytics_server_0.user.User;
import org.springframework.data.domain.Page;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Domain {
    @Id
    Long id;
    String domainURL;
    Long accountOwnerId;

    @OneToMany
    List<PageView> pageViews;

    public Domain(){}

    public Domain(String domainURL) {
        this.domainURL = domainURL;
    }
    public Domain(String domainURL, Long accountOwnerId) {
        this.domainURL = domainURL;
        this.accountOwnerId = accountOwnerId;
    }
    public Domain(String domainURL, List<PageView> pageViews){
        this.domainURL = domainURL;
        this.pageViews = pageViews;
    }
    public Domain(String domainURL, Long accountOwnerId, List<PageView> pageViews) {
        this.domainURL = domainURL;
        this.accountOwnerId = accountOwnerId;
        this.pageViews = pageViews;
    }

    public String getDomainURL() {
        return domainURL;
    }

    public void setDomainURL(String domainURL) {
        this.domainURL = domainURL;
    }

    public Long getAccountOwnerId() {
        return accountOwnerId;
    }

    public void setAccountOwner(User accountOwner) {
        this.accountOwnerId = accountOwnerId;
    }

    public List<PageView> getPageViews() {
        return pageViews;
    }

    public void setPageViews(List<PageView> pageViews) {
        this.pageViews = pageViews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountOwnerId(Long accountOwnerId) {
        this.accountOwnerId = accountOwnerId;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "domainURL='" + domainURL + '\'' +
                ", accountOwner=" + accountOwnerId +
                ", pageViews=" + pageViews +
                '}';
    }
}
