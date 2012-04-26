/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvmr.poc.pmobile.domain;

import java.io.Serializable;

/**
 *
 * @author vreddy.fp
 */
public class RssFeed implements Serializable  {
    
    private String title;
    private String rssUrl;

    public RssFeed() {
    }

    public RssFeed(String title, String rssUrl) {
        this.title = title;
        this.rssUrl = rssUrl;
    }

    public String getRssUrl() {
        return rssUrl;
    }

    public void setRssUrl(String rssUrl) {
        this.rssUrl = rssUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
