package com.gallo.analytics_server_0.domain;

import org.apache.tomcat.jni.Local;
import org.springframework.data.domain.Page;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAGE_VIEWS")
public class PageView {
    @Id
    long Id;
    LocalDateTime date;
    Long domainId;
    String url;

    public PageView() {
    }
    public PageView(LocalDateTime date, String url){
        this.date = date;
        this.url = url;
    }

    public PageView(LocalDateTime date, Long domainId, String url) {
        this.date = date;
        this.domainId = domainId;
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "PageView{" +
                "Id=" + Id +
                ", date=" + date +
                ", domainId=" + domainId +
                ", url='" + url + '\'' +
                '}';
    }
}
