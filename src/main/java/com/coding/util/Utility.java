package com.coding.util;

import com.coding.wcapp.Main;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class Utility {

    static String APP_PROPERTIES_FILENAME = "app.properties";

    /**
    *  Instantiate class by nameø
    *  @param className full classs name
     * @param tClass interface type to cast
    * */
    public static <T> T instantiate(String className, Class<T> tClass)  {
        try {
            return (T) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e ){
            System.err.println("Class "+ className + " not found !");
            return null;
        }
        catch ( Exception e ){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Read only application specific properties from resources folders
     * */
    public static Properties appProperties(){
        try {

            Properties prop = new Properties();
            prop.load(Utility.class.getClassLoader().getResourceAsStream("app.properties"));
            return prop;

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * Read properties file
     * */
    public static Properties readProperties(String file){
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(file));
            return prop;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static CLIArgumentParser setArguments(List<Argument> arguments, String[] args) {
        CLIArgumentParser parser = new CLIArgumentParser(arguments);
        parser.parse(args);
        return parser;
    }
}
