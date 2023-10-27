package com.coding.util;

/**
 * A DataModel class for handling argument data
 * */
public class Argument {

    private String option;

    private String longOption;

    private boolean hasArg;

    private String description;

    public Argument(String option, String longOption, boolean hasArg, String description) {
        this.option = option;
        this.longOption = longOption;
        this.hasArg = hasArg;
        this.description = description;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getLongOption() {
        return longOption;
    }

    public void setLongOption(String longOption) {
        this.longOption = longOption;
    }

    public boolean isHasArg() {
        return hasArg;
    }

    public void setHasArg(boolean hasArg) {
        this.hasArg = hasArg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
