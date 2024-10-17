package com.dmdev.oop.practice2;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println(Arrays.toString(processorType.values()));
    }
}
