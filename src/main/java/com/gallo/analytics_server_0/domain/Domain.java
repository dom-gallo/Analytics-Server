package com.gallo.analytics_server_0.domain;

import com.gallo.analytics_server_0.user.User;

import java.util.ArrayList;

public class Domain {
    String domainURL;
    User accountOwner;
    ArrayList<PageView> pageViews;

    public Domain(){}

    public Domain(String domainURL, User accountOwner) {
        this.domainURL = domainURL;
        this.accountOwner = accountOwner;
    }

    public Domain(String domainURL, User accountOwner, ArrayList<PageView> pageViews) {
        this.domainURL = domainURL;
        this.accountOwner = accountOwner;
        this.pageViews = pageViews;
    }

    public String getDomainURL() {
        return domainURL;
    }

    public void setDomainURL(String domainURL) {
        this.domainURL = domainURL;
    }

    public User getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(User accountOwner) {
        this.accountOwner = accountOwner;
    }

    public ArrayList<PageView> getPageViews() {
        return pageViews;
    }

    public void setPageViews(ArrayList<PageView> pageViews) {
        this.pageViews = pageViews;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "domainURL='" + domainURL + '\'' +
                ", accountOwner=" + accountOwner +
                ", pageViews=" + pageViews +
                '}';
    }
}
