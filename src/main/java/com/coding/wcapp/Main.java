package com.coding.wcapp;

import com.coding.util.CLIArgumentParser;
import com.coding.util.Utility;
import java.util.Properties;

public class Main {

    public static void main(String arg[])  {

        // load app related properties
        Properties prop = Utility.appProperties();

        // instantiate word count class as specified in property file
        IWC wc = Utility.instantiate(prop.getProperty("wc_class"), IWC.class);

        // parse and load arguments
        CLIArgumentParser parser = Utility.setArguments(new WCArgument().getArguments(),arg);

        // for each of the options in command line run the corresponding method
        for(String option: parser.getOptionList()) {
            for (String file : parser.getArgs()) {
                if (option == "c") {
                    System.out.println("size(B): " + wc.countBytes(file)); // wordcount 342190
                }
                if (option == "l") {
                    System.out.println("lines: " + wc.countLines(file));
                }
                if (option == "w") {
                    System.out.println("words: " + wc.countWords(file));
                }
                if (option == "m") {
                    System.out.println("characters: " + wc.countCharacter(file));
                }
            }
        }

    }


}
