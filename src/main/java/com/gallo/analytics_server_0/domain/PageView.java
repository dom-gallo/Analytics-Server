package com.gallo.analytics_server_0.domain;

import org.springframework.data.domain.Page;

import java.time.LocalDate;

public class PageView {
    LocalDate date;
    Domain domain;
    String url;

    public PageView() {
    }

    public PageView(LocalDate date, Domain domain, String url) {
        this.date = date;
        this.domain = domain;
        this.url = url;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
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
                ", domain=" + domain +
                ", url='" + url + '\'' +
                '}';
    }
}
