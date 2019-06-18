package com.example.week2test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    public static void main(String[] args) {


        HashMap<String, ArrayList<Integer>> Hmap = new HashMap<>();
        ArrayList<Integer> list = null;

        String[][] my2dArray = {{"a", "b", "c"},
                                {"d", "e", "f"},
                                 {"g", "a", "b"}};



        for (int rows = 0; rows < my2dArray.length; rows++) {
            for (int columns = 0; columns < my2dArray[rows].length; columns++) {

                String key = my2dArray[rows][columns];
                if (Hmap.containsKey(key)) {
                    list = Hmap.get(key);
                    list.add(rows);
                    list.add(columns);

                } else {
                    list = new ArrayList<>();
                    list.add(rows);
                    list.add(columns);
                    Hmap.put(key, list);
                }

            }

        }


        for (String key : Hmap.keySet()) {
             {
                System.out.println( key + "  " + Hmap.get(key));
            }
        }

        }

    }





