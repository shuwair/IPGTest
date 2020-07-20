package com.ipg;

import java.io.IOException;

/*
 * Generate file with given no of unique rows of string
 */
public class UniqueStringFileGenerator {

    /**
     * @param noOfRows No of rows to be written in file in range of 1 to 2^30-1
     * @throws RowSizeValidatorException
     */
    public void generateFile(int noOfRows) throws RowSizeValidatorException {
        try {
            RowSizeValidator.validate(noOfRows);
            StringGenerator generator = new StringGenerator();
            StringWriter writer = new StringWriter(generator);
            writer.writeStringsToFile(noOfRows);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (RowSizeValidatorException validatorException) {
            throw validatorException;
        }
    }
}
