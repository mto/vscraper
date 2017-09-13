package com.techmaster.vscraper;

import com.techmaster.vscraper.config.Config;
import com.techmaster.vscraper.io.BotWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class SeleniumBot {

    private final Config cfg;

    private final BotWriter bw;

    private final WebDriver browser;

    public SeleniumBot(Config cfg, BotWriter bw){
        this.cfg = cfg;
        this.bw = bw;

        bw.mkDirs("/" + cfg.getTargetName());

        browser = new ChromeDriver();
    }

    public void fetchHomePage() {
        try {
            browser.get(cfg.getHomeLink());
            String homeSrc = browser.getPageSource();
            //TODO:
            // 1. Save content as cfg.getTargetName() + /home.html
            // 2. Takes screenshot and save it as  cfg.getTargetName() + /home_screnshot.png
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void fetchNewsPage() {
        //TODO:
        // 1. Save content as cfg.getTargetName() + /news.html
        // 2. Takes screenshot and save it as  cfg.getTargetName() + /news_screnshot.png
    }

    public void fetchVideosPage() {
        //TODO:
        // 1. Save content as cfg.getTargetName() + /videos.html
        // 2. Takes screenshot and save it as  cfg.getTargetName() + /videos_screnshot.png
    }

    public void fetchSportsPage() {
        //TODO:
        // 1. Save content as cfg.getTargetName() + /sports.html
        // 2. Takes screenshot and save it as  cfg.getTargetName() + /sports_screnshot.png
    }

}
