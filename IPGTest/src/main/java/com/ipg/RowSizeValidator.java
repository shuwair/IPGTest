package com.ipg;

/**
 * Validator for max and min row size computed values is assigned for 2^30-1
 */
public class RowSizeValidator {

    public static final int maxRowSize = 1073741823; // value for 2^30-1

    public static void validate(int noOfRows) throws RowSizeValidatorException {
        if (noOfRows < 0 || noOfRows > maxRowSize)
            throw new RowSizeValidatorException();

    }
}
