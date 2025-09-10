package com.Project.Utilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("configuration.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}


