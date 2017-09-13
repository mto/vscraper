package com.techmaster.vscraper;

import com.techmaster.vscraper.config.Config;
import com.techmaster.vscraper.io.BotWriter;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class HttpBot {

    private final Config cfg;

    private final BotWriter bw;

    private final HttpClient httpClient;

    public HttpBot(Config cfg, BotWriter bw) {
        this.cfg = cfg;
        this.bw = bw;

        bw.mkDirs("/" + cfg.getTargetName());

        httpClient = HttpClientBuilder.create().build();
    }

    public void fetchHomePage() {
        try {
            String homeLink = cfg.getHomeLink();
            //TODO: Use ApacheHttpClient to store and save content as cfg.getTargetName() + /home.html
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void fetchNewsPage() {
        //TODO: Fetch content of news page and save it as cfg.getTargetName() + /news.html
    }

    public void fetchVideosPage() {
        //TODO: Fetch content of news page and save it as cfg.getTargetName() + /videos.html
    }

    public void fetchSportsPage() {
        //TODO: Fetch content of news page and save it as cfg.getTargetName() + /sports.html
    }

}
