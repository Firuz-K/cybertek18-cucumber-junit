package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // we need to create Properties object

    public static Properties properties = new Properties();


    static {

        // we need to get a path of our properties

        String path="configuration.properties";

        // We need to open our property file with FileInputStream

        try {
            FileInputStream file = new FileInputStream(path);

            // we need to load our file
            properties.load(file);

            // we need to close our file
            file.close();

        }catch ( IOException e){
            System.out.println("No such file found");
        }

    }

    public static String getProperty(String keyWord){
        return properties.getProperty( keyWord);
    }

}
