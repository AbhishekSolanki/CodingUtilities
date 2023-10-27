package com.coding.wcapp;

import java.io.*;

/**
 * Implementation version 1.0 for word count application
 * */
public class WC implements IWC {

    /**
     * Calulates size of files in bytes of a given file
     * @param file file location
     * */
     public long countBytes(String file)  {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            return fileInputStream.getChannel().size();
        } catch (IOException e) {
            return -1;
        }

    }

    /**
     * Counts the number of lines of a file
     * @param file file location
     * */
     public long countLines(String file) {
         try{
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             int lines = 0;
             while (bufferedReader.readLine()!=null) lines++;
             return lines;
         } catch (Exception e){
             return -1;
         }
    }

    public long countCharacter(String file) {
        return 0;
    }

    public long countWords(String file) {
        return 0;
    }
}

