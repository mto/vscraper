package com.techmaster.vscraper;

import com.techmaster.vscraper.config.Config;
import com.techmaster.vscraper.io.BotWriter;
import org.junit.Test;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class SeleniumBotTest {

    @Test
    public void testVnexpress() {
        //TODO: Complete the Unit test
        Config cfg = new Config() {
            @Override
            public String getTargetName() {
                return "vnexpress";
            }

            @Override
            public String getHomeLink() {
                return "https://vnexpress.net";
            }

            @Override
            public String getNewsLink() {
                return "https://vnexpress.net/tin-tuc/thoi-su";
            }

            @Override
            public String getVideosLink() {
                return "https://video.vnexpress.net";
            }

            @Override
            public String getSportsLink() {
                return "https://thethao.vnexpress.net";
            }
        };

        BotWriter bw = new BotWriter("target");

        SeleniumBot sb = new SeleniumBot(cfg, bw, "/Users/mto/java/selenium/drivers/chromedriver");
        try {
            sb.fetchHomePage();
        } finally {
            sb.shutDown();
        }
    }

}
