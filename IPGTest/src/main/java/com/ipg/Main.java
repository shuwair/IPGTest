package com.ipg;

public class Main {
    public static void main(String[] args)
    {
        UniqueStringFileGenerator generator = new UniqueStringFileGenerator();
        try {
            generator.generateFile(100);
        } catch (RowSizeValidatorException validatorException) {
            validatorException.printStackTrace();
        }
    }
}
