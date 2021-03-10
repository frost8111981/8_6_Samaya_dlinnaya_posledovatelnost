package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(128);
        array.add(128);

//        for (int i = 0; i < 10; i++) {
//            int input = Integer.parseInt(reader.readLine());
//            array.add(input);
//        }

        int count = 1;
        int max = 0;

        for (int i = 0; i < array.size() - 1; i++) {

            if (array.get(i).equals(array.get(i + 1))) {
                count = count + 1;
            }
            if (count > max) {
                max = count;
            } else if (!array.get(i).equals(array.get(i + 1))) {
                count = 1;
            }

        }



        System.out.println(max);

    }
}