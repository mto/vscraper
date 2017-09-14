package com.techmaster.vscraper;

import com.techmaster.vscraper.config.Config;
import com.techmaster.vscraper.io.BotWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class SeleniumBot {

    private final Config cfg;

    private final BotWriter bw;

    private final WebDriver browser;

    public SeleniumBot(Config cfg, BotWriter bw, String chromeDriverFile){
        this.cfg = cfg;
        this.bw = bw;

        bw.mkDirs("/" + cfg.getTargetName());

        ChromeDriverService cs = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(chromeDriverFile))
                .build();

        browser = new ChromeDriver(cs);
    }

    public void fetchHomePage() {
        try {
            browser.get(cfg.getHomeLink());
            String homeSrc = browser.getPageSource();
            bw.stringToFile(homeSrc, "/" + cfg.getTargetName() + "/home.html");

            WebElement root = browser.findElement(By.tagName("html"));
            root.getScreenshotAs(OutputType.FILE);

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

    public void shutDown(){
        browser.manage().deleteAllCookies();
        browser.close();
    }

}
