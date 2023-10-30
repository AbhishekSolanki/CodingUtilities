package com.coding.wcapp;

import com.coding.util.Utility;
import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

public class TestWcapp {
    // sample test file from resources
    String test_file = TestWcapp.class.getClassLoader().getResource("pg132.txt").getFile();
    // load app related properties
    Properties prop = Utility.appProperties();
    IWC wc = Utility.instantiate(prop.getProperty("wc_class"), IWC.class);

    @Test
    public void countByteTest() {
        Assert.assertEquals(342190,wc.countBytes(test_file));
    }

    @Test
    public void countLinesTest() {
        Assert.assertEquals(7145,wc.countLines(test_file));
    }

    @Test
    public void countWordsTest() {
        Assert.assertEquals(60127,wc.countWords(test_file));
    }
}
