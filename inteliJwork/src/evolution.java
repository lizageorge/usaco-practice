/*
ID: liza1
LANG: JAVA
TASK: evolution
*/

import java.util.*;
import java.io.*;

public class evolution { //be sure that the class name also lines up perfectly with the problem name!!
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\evolution.in")); //TEST
        BufferedReader f = new BufferedReader(new FileReader("evolution.in")); //CONTEST
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("evolution.out"))); //CONTEST

//        StringTokenizer st;

        int n = Integer.parseInt(f.readLine());
        int output = 0;

        for(int m = 0; m < n; m++){

        }

//        while(f.ready()){
//
//        }

//        System.out.println(output); //TEST
        out.println(output); //CONTEST
        out.close();
    }
}
