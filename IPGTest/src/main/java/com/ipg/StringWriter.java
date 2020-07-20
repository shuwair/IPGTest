package com.ipg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Used BufferedWriter for wiring unique generated rows to file with buffer size of 100
 * as each row contains 100 chars
 */
public class StringWriter {

    public static String PATH = "uniquestrings.txt";
    private File file;
    private FileWriter writer;
    private int bufSize = 100;
    private StringGenerator generator;


    StringWriter(StringGenerator generator) {
        this.generator = generator;
    }


    private void createFile() throws IOException {

        file = new File(PATH);
        writer = new FileWriter(file);
    }

    public void writeStringsToFile(int noOfRows) throws IOException {

        createFile();

        try (BufferedWriter bufferedWriter = new BufferedWriter(writer, bufSize)) {
            for (int i = 0; i < noOfRows; i++) {
                bufferedWriter.write(generator.getNextUniqueString());
            }
        }


    }


}
