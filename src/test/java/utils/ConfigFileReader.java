package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "configs//config.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    // URL de la aplicación
    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    // Navegador
    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    // Modo visible o headless
    public String setVisibleBrowser() {
        String visibleBrowser = properties.getProperty("visibleBrowser");
        if (visibleBrowser != null) return visibleBrowser;
        else throw new RuntimeException("visibleBrowser not specified in the Configuration.properties file.");
    }

    // Username
    public String getUsername() {
        String username = properties.getProperty("username");
        if (username != null) return username;
        else throw new RuntimeException("username not specified in the Configuration.properties file.");
    }

    // Password
    public String getPassword() {
        String password = properties.getProperty("password");
        if (password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }
}
