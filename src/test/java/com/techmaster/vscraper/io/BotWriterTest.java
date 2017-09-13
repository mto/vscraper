package com.techmaster.vscraper.io;

import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class BotWriterTest {

    @Test
    public void streamToFile() {
        BotWriter bw = new BotWriter("target");
        ByteArrayInputStream is = new ByteArrayInputStream("123456789".getBytes());
        bw.streamToFile(is, "/s2f.txt");

        //TODO: Add assert statement to compare the content of s2f.txt file with '123456789'
    }
}
