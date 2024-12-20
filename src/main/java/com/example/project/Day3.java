package com.example.project;

public class Day3 
{
      public static String[][] generateSnowflake(int size){ 
        //you will be tested on this method
        String[][] arrayGrid = new String[size][size];

        for (int i = 0; i < size; i++){
          arrayGrid[i][size / 2] = "*"; 
          arrayGrid[size / 2][i] = "*"; 
          arrayGrid[i][i] = "*";      
          arrayGrid[i][size - 1 - i] = "*"; 
        }

        for (int z = 0; z < size; z++){
          for (int j = 0; j < size; j++){
            arrayGrid[z][j] = (arrayGrid[z][j] == null) ? " " : arrayGrid[z][j];
          }
        }

        return arrayGrid;
      }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake){
      for (int z = 0; z < snowflake.length; z++){
        for (int j = 0; j < snowflake[z].length; j++){
          System.out.print(snowflake[z][j]);
      }
      System.out.println("");
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(4));
    }
}
