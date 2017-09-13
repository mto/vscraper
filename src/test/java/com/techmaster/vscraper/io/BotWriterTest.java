package com.techmaster.vscraper.io;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Path src = new File("target/s2f.txt").toPath();

        try {
            Files.copy(src, out);

            assertEquals("123456789", new String(out.toByteArray()));
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }
}
