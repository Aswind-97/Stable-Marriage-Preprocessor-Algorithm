/*
Anthony Lopez
COMP 482 MW 11 AM
Project 1
*/

import java.io.*;
import java.util.*;



public class Project1
{

  public static void main(String[] args)throws Exception
  {
    //Read input file based on local directory and if error locating file,
    //absolute pathname must be used
    File file = new File("input.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));

    String st = br.readLine();
    //Grab first digit on first line to determine length of file input for matrix
    int count = Integer.parseInt(st);
    int[][] array2d = new int[count][count];
    String[] stringArray = new String[count];
    int rankedIndex = 0;


    for(int firstIndex = 0; firstIndex < count; firstIndex++)
    {
      st = br.readLine();

      for(int currentIndex = 0; currentIndex < count; currentIndex++)
      {
        //Converts String to String Array to have each value in an index
        stringArray = st.split(" ");

        /*
        Grabs first index's value of incoming string, goes to new matrix's index for that value
        and inputs current priority/preference from other possible spouse
        Example: First digit is 3. So 3 - 1 = 2. So man 3 has index of 2, so in
        new matrix we have [0][2] and we make that value = priority,
        which is currently one, or index 0. so matrix[0][2] = 1
        */
        rankedIndex = Integer.parseInt(stringArray[currentIndex]) - 1;
        array2d[firstIndex][rankedIndex] = currentIndex + 1;
      }

    }//End of main traversing for loop

    //Prints out with modified format
    System.out.println(Arrays.deepToString(array2d).replace("], ", "\n").replace("[[", " ").replace("]]", " ").replace("[", " ").replace(",", " "));

  }


}//End of Project1 class
