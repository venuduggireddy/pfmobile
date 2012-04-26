/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvmr.poc.pmobile.bean;

import com.dvmr.poc.pmobile.domain.RssFeed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



/**
 *
 * @author vreddy.fp
 */
@ManagedBean
@ViewScoped
public class MobileTestController implements Serializable {

   
    private List<RssFeed> rssFeedsList;
    private String selectedFeed = "http://blog.primefaces.org/?feed=rss2";
    private RssFeed rssFeed = new RssFeed();
    
    @PostConstruct
    public void init(){
        rssFeedsList = new ArrayList<RssFeed>();
        rssFeedsList.add(new RssFeed("Primefaces Blog", "http://blog.primefaces.org/?feed=rss2"));
        rssFeedsList.add(new RssFeed("BBC Top News", "http://feeds.bbci.co.uk/news/rss.xml"));
        rssFeedsList.add(new RssFeed("Google News", "http://news.google.com/news?ned=us&topic=n&output=rss"));
        rssFeedsList.add(new RssFeed("Yahoo Sprots", "http://rss.news.yahoo.com/rss/sports"));
    }
    
    /**
     * 
     * @param key 
     */
    public String viewSelectedFeed(RssFeed rssFeed){
        this.selectedFeed = rssFeed.getRssUrl();
        return "pm:feedsView";
    }
   
    /**
     * 
     */
    public String addNewFeed(){
        if(null != rssFeed && null != rssFeed.getTitle() && null != rssFeed.getRssUrl()){
            rssFeedsList.add(rssFeed);
        }
        rssFeed = new RssFeed();
        return "pm:main";
    }

    public List<RssFeed> getRssFeedsList() {
        return rssFeedsList;
    }

    public RssFeed getRssFeed() {
        return rssFeed;
    }

    public void setRssFeed(RssFeed rssFeed) {
        this.rssFeed = rssFeed;
    }

    public String getSelectedFeed() {
        return selectedFeed;
    }

}
