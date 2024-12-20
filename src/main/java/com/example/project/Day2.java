package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ 
      Random random = new Random();
      String[] niceList = new String[names.length];
      String[] naughtyList = new String[names.length];
      int niceLen = 0;
      int naughtyLen = 0;
      
        for(int i = 0; i < names.length; i++){
            
            int assign = random.nextInt(2);
            switch (assign){
                case 0:
                    niceList[niceLen] = names[i];
                    niceLen++;
                    break;
                case 1:
                    naughtyList[naughtyLen] = names[i];
                    naughtyLen++;
                    break;
            }
        }

        String[][] fullList = {niceList, naughtyList};
        return fullList; 
    }
}