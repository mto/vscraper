package com.techmaster.vscraper.io;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public class BotWriter {

    private final String rootDir;

    public BotWriter() {
        this(System.getProperty("java.io.tmpdir"));
    }

    public BotWriter(String absPath) {
        rootDir = absPath;
        File f = new File(rootDir);
        if (!f.exists()) {
            f.mkdirs();
        }
    }

    public void mkDirs(String relativePath) {
        File f = new File(rootDir + relativePath);
        if (!f.exists() || !f.isDirectory()) {
            f.mkdirs();
        }
    }

    public void streamToFile(InputStream in, String dstPath) {
        Path path = new File(rootDir + dstPath).toPath();
        //TODO: Use methods in java.nio.file.Files to write to destinatation file in REPLACE_EXISTING mode
        try {
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

    public void stringToFile(String s, String dstPath) {
        streamToFile(new ByteArrayInputStream(s.getBytes(Charset.defaultCharset())), dstPath);
    }
}
