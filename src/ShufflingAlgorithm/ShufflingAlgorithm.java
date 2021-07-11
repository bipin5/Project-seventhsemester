/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShufflingAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class ShufflingAlgorithm {
    int[] num = new int[10];
    int high;
    public int[] Shuffling(int highest) {
        int i = 0;
        high = highest;
        while(i<10){
            int rand = (int)(Math.random() * high + 1);
            boolean exists = false;
            for(int j=0;j<num.length;j++)
            {
                if(num[j]==rand)
                {
                    exists = true;
                    break;
                }
            }
            if(!exists)
            {
            num[i]=rand;
            i++;
            }    
        }
        for(int j=0;j<10;j++)
        {
            System.out.println(num[j]);
        }        
   return num;
   }
    
}