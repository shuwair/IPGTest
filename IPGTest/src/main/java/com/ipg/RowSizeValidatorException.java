package com.ipg;

/**
 * Exception for max or min row size validation
 */
class RowSizeValidatorException extends Exception {

    public static final String SIZE_ERROR = "Row size must be in between range of 1 to 2^30-1 or (1073741823)";


    public String toString() {
        return SIZE_ERROR;
    }
}
