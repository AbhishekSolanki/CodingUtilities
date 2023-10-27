package com.coding.wcapp;

/**
 * Interface for word count application
 * */
public interface IWC {
     long countBytes(String file);
     long countLines(String file);
     long countCharacter(String file);
     long countWords(String file);
}
