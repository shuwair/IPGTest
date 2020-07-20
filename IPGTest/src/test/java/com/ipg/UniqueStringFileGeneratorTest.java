package com.ipg;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class UniqueStringFileGeneratorTest {


    @Test
    public void testUniqueStringFileGenerator_success() throws RowSizeValidatorException {
        new UniqueStringFileGenerator().generateFile(100);
    }


    @Test()
    public void testRowSizeValidatorMinValueTest_fail() {

        UniqueStringFileGenerator fileGenerator = new UniqueStringFileGenerator();
        assertThrows(RowSizeValidatorException.class, () -> {
            fileGenerator.generateFile(-1);
        });
    }

    @Test()
    public void testRowSizeValidatorMaxValueTest_fail() {

        UniqueStringFileGenerator fileGenerator = new UniqueStringFileGenerator();
        assertThrows(RowSizeValidatorException.class, () -> {
            fileGenerator.generateFile(1073741824);
        });
    }

    @Test
    public void testRowSizeValidator_success() throws RowSizeValidatorException {
        new UniqueStringFileGenerator().generateFile(100);
    }

    @Test
    public void testRowUniqueness_success() {
        Set<String> uniqueRows = new HashSet<>();
        StringGenerator stringGenerator = new StringGenerator();
        for (int i = 0; i < 10; i++) {
            uniqueRows.add(stringGenerator.getNextUniqueString());
        }
        //Check all rows are unique
        assertEquals(uniqueRows.size(), 10);
    }

    @Test
    public void testFileData_success() throws RowSizeValidatorException {
        new UniqueStringFileGenerator().generateFile(10);
        StringGenerator generator = new StringGenerator();
        try (Stream<String> lines = Files.lines(Paths.get(StringWriter.PATH))) {
            List<String> uniqueRows = lines.collect(Collectors.toList());
            for (String uniqueRow : uniqueRows) {
                assertEquals(uniqueRow.trim(), generator.getNextUniqueString().trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

