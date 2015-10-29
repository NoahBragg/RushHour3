/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rushhourproj3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author noahbragg
 */
public class RushHourProj3 {

    
    private void readInSampleData() {
        File file = new File(destination);

        try {
            Scanner myScan = new Scanner(file);
            numOfDenominations = myScan.nextInt();
            frequencyIndex = numOfDenominations;
            denominations = new int[numOfDenominations];
            finalDenomAmounts = new int[numOfDenominations];
            for (int i = 0; i < numOfDenominations; i++) {
                denominations[i] = myScan.nextInt();
            }
            numOfProblems = myScan.nextInt();
            problems = new int[numOfProblems];
            for (int i = 0; i < numOfProblems; i++) {
                problems[i] = myScan.nextInt();
            }
            myScan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
