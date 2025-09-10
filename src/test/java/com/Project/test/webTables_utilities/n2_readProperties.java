package com.Project.test.webTables_utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class n2_readProperties {
    @Test
    public void readProperties() throws IOException {
        Properties properties = new Properties();
        FileInputStream  file = new FileInputStream("configuration.properties");
        properties.load(file);
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

    }

}
