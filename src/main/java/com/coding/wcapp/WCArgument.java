package com.coding.wcapp;

import com.coding.util.Argument;
import com.coding.util.CLIArgumentParser;
import com.coding.util.Utility;

import java.util.ArrayList;
import java.util.List;

public class WCArgument {
    List<Argument> arguments ;

    public WCArgument() {
        arguments = new ArrayList<Argument>();
        arguments.add(new Argument("c","countbytes",false,"bytes of files")); // list of arguments progam expects
        arguments.add(new Argument("l","countlines",false,"number of lines in a file")); // list of arguments progam expects
        //CLIArgumentParser parser = Utility.setArguments(arguments,arg); // parse and load arguments
    }

    public List<Argument> getArguments() {
        return arguments;
    }
}
