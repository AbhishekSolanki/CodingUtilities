package com.coding.util;


import org.apache.commons.cli.*;

import java.util.Arrays;
import java.util.List;

/**
 * Adapter class that utilized ApacheCommonsCLI for parsing cli arguments
 * */
public class CLIArgumentParser {

    Options options;
    CommandLineParser parser;
    HelpFormatter formatter;
    CommandLine cmd;
    List<Argument> arguments;

    /**
     *  Instantiate CLIArgumentParser using data model Argument List
     * */
    public CLIArgumentParser(List<Argument> arguments) {
         options = new Options();
         parser = new DefaultParser();
         formatter = new HelpFormatter();
         this.arguments = arguments;
    }


    /**
     *  Paarse the actual cli args from main
     * */
    public void parse(String[] args)  {
        try{
            Options options = new Options();
            for(Argument argument: arguments) {
                Option option = new Option(  argument.getOption(),
                        argument.getLongOption(),
                        argument.isHasArg(),
                        argument.getDescription()
                );
                options.addOption(option);
            }
            cmd = parser.parse(options, args);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String get(String option){
        return cmd.getOptionValue(option);
    }

    public boolean hasOption(String option){
        return cmd.hasOption(option);
    }

    public String[] getOptionList(){
        return  Arrays.stream(cmd.getOptions()).map(x->x.getOpt().toString()).toArray(String[]::new);
    }

    public String[] getArgs(){
        return  Arrays.stream(cmd.getArgs()).toArray(String[]::new);
    }

}
