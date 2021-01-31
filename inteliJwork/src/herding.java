/*
ID: liza1
LANG: JAVA
TASK: herding
*/

import java.util.*;
import java.io.*;

public class herding { //be sure that the class name also lines up perfectly with the problem name!!
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\herding.in")); //TEST
        BufferedReader f = new BufferedReader(new FileReader("herding.in")); //CONTEST
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("herding.out"))); //CONTEST

        StringTokenizer st = new StringTokenizer(f.readLine());

        long minA = Long.parseLong(st.nextToken());
        long midA = Long.parseLong(st.nextToken());
        long maxA = Long.parseLong(st.nextToken());

        long minB = minA;
        long midB = midA;
        long maxB = maxA;

        //find min = A
        long minCount = 0;
        long daA = midA - minA -1;
        long dbA = maxA - midA-1;

        //trying to see if mincount is just smallest distance
        if(daA<dbA){
            minCount = daA;
        }else{
            minCount = dbA;
        }
//        while(daA != 0 || dbA != 0){
//            if(daA < dbA){
//                maxA = midA;
//                midA = minA + 1;
//            }else {
//                minA = midA;
//                midA = maxA - 1;
//            }
//            minCount++;
//            daA = midA - minA-1;
//            dbA = maxA - midA-1;
//        }

        //find max = B
        long maxCount = 0;
        long daB = midB - minB-1;
        long dbB = maxB - midB-1;

        //trying to see if maxcount is just largest distance
        if(daB>dbB){
            maxCount = daB;
        }else{
            maxCount = dbB;
        }
//
//        while(daB != 0 || dbB != 0){
//            if(daB > dbB){
//                maxB = midB;
//                midB = minB + 1;
//            }else {
//                minB = midB;
//                midB = maxB - 1;
//            }
//            maxCount++;
//            daB = midB - minB-1;
//            dbB = maxB - midB-1;
//        }

//        System.out.println(minCount); //TEST
        out.println(minCount); //CONTEST
        out.println(maxCount); //CONTEST
        out.close();
    }
}
