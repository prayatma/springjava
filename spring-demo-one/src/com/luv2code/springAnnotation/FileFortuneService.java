package com.luv2code.springAnnotation;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    // private String fileName = "fortune-data.txt";

    private String fileName = "fortune-data";
    private List<String> theFortunes;

    // create a random number generator

    private Random myRandom = new Random();

    public FileFortuneService () {
        System.out.println(">> FileFortuneService: inside default constructor");
    }

    private void loadTheFortunesFile() {

        System.out.println(">> FileFortuneService: inside method loadTheFortuneFile");

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize array list
        theFortunes = new ArrayList<String>();

        // read fortunes from file
        try(BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String getFortune() {

        //pick a random string from the array

        int index = myRandom.nextInt(theFortunes.size());

        String tempFortune = theFortunes.get(index);

        return tempFortune;
    }
}
