package kpencak;

import java.lang.System; // redundant - automatical
import java.lang.*; // redundant - automatical + prev import
import java.util.Random;  // import tells us where to find Random
import java.util.*; // redundant - prev line

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();   // DOES NOT COMPILE
        System.out.println(r.nextInt(10));
    }
}
