package com.gallo.analytics_server_0.domain;

import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PageView {
    LocalDateTime date;
    Long domainId;
    String url;

    public PageView() {
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

    @Override
    public String toString() {
        return "PageView{" +
                "date=" + date +
                ", domainId=" + domainId +
                ", url='" + url + '\'' +
                '}';
    }
}
