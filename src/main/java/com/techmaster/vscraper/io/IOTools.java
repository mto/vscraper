package com.techmaster.vscraper.io;

import java.io.*;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 9/14/17
 */
public class IOTools {

    public static void streamToStream(InputStream in, OutputStream out) {
        //TODO:
        //Read bytes from in and write to out
    }

    public static void readerToWriter(Reader r, Writer w) {
        //TODO:
        //Read character from Reader object r, and write to Writer object w
    }

    public static void streamToFile(InputStream in, File f) {
        //TODO:
        //Read bytes from in and write it to file f
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStream fout = new FileOutputStream(f);

        } catch (IOException ioex) {

        }
    }

    public static void readerToFile(Reader r, File f) {
        //TODO:
        //Read character from r and write it to file f
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            Writer w = new OutputStreamWriter(new FileOutputStream(f));

        } catch (IOException ioex) {

        }

    }

    public static String streamToString(InputStream in) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //TODO:
        //Use method streamToStream to get byte[] arrays from InputStream in

        return new String(out.toByteArray());
    }

    public static String fileToString(File f) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            InputStream in = new FileInputStream(f);
            //TODO:
            //Read bytes from in and write to out
        } catch (IOException ioEx) {

        }

        return new String(out.toByteArray());
    }
}
