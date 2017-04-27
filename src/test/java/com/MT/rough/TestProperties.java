package com.MT.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by adhirajsingh on 4/26/17.
 */
public class TestProperties {
    public static void main(String args[]) throws IOException {

        Properties config = new Properties();
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fio = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/config.properties");
        config.load(fio);
        System.out.println(config.getProperty("browser"));
    }
    public TestProperties() throws FileNotFoundException {
        }

}
