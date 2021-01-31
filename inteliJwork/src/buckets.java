/*
ID: liza1
LANG: JAVA
TASK: buckets
*/

import java.util.*;
import java.io.*;

public class buckets { //be sure that the class name also lines up perfectly with the problem name!!
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\herding.in")); //TEST
        BufferedReader f = new BufferedReader(new FileReader("herding.in")); //CONTEST
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out"))); //CONTEST

        char[][] input = new char[10][10];
//        while(cT != cB){
//            if(EW == 'W'){
//                cT--;
//            }else{
//                cT++;
//            }
//            output++;
//            if(input[rT][cT] == 'R'){ //hit the rock
//                if(EW == 'W'){
//                    cT++;
//                }else{
//                    cT--;
//                }
//
//                if(NS == 'N'){
//                    rT--;
//                }else{
//                    rT++;
//                }
//
//                if(EW == 'W'){
//                    cT--;
//                }else{
//                    cT++;
//                }
//
//                output++;
//            }
//        }
//
//        while(rT != rB){
//            if(NS == 'N'){
//                rT--;
//            }else{
//                rT++;
//            }
//
//            if(input[rT][cT] == 'R'){ //hit the rock
//                if(EW == 'W'){
//                    cT++;
//                }else{
//                    cT--;
//                }
//
//                if(NS == 'N'){
//                    rT--;
//                }else{
//                    rT++;
//                }
//
//                if(EW == 'W'){
//                    cT--;
//                }else{
//                    cT++;
//                }
//
//                output++;
//
//            }
//        }


//        while(OK){
//
//            if(NS == 'N'){
//                rT--;
//            }else{
//                rT++;
//            }
//            output++;
//
//            if(input[rT][cT] == 'R'){ //hit the rock
//                output--;
//                if(NS == 'N'){
//                    rT++;
//                }else{
//                    rT--;
//                }
//            }
//
//            if(rB == cT && cB == cT){ // barn has been reached
//                break;
//            }
//
//            if(EW == 'W'){
//                cT--;
//            }else{
//                cT++;
//            }
//            output++;
//
//            if(rB == cT && cB == cT){ // barn has been reached
//                OK = false;
//            }
//
//            if(input[rT][cT] == 'R'){ //hit the rock
//
//            }
//        }

//        StringTokenizer st;

//        int n = Integer.parseInt(f.readLine());
//        int output = 0;
//
//        for(int m = 0; m < n; m++){
//
//        }

//        while(f.ready()){
//
//        }

//        System.out.println(output); //TEST
        for (int i = 0; i < 10; i++) {
            String line = f.readLine();
            char[] lineArr = line.toCharArray();
            for (int j = 0; j < 10; j++) {
                input[i][j] = lineArr[j];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

        int rB = 0, cB = 0, rR = 0, cR = 0, rL = 0, cL = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(input[i][j] == 'R'){
                    rR = i;
                    cR = j;
                }else if(input[i][j] == 'B'){
                    rB = i;
                    cB = j;
                }
                else if(input[i][j] == 'L'){
                    rL = i;
                    cL = j;
                }
            }
        }

//        System.out.println(rB + " " + cB + " " + rR + " " + cR + " " + rL + " " + cL);

        char NS, EW;

        if( rB < rL){
            NS = 'N';
        }else{
            NS = 'S';
        }
        if(cB < cL){
            EW = 'W';
        }else{
            EW = 'E';
        }

//        System.out.println( NS + " " + EW);

        int output = 0;
        boolean OK = true;
        int rT = rL;
        int cT = cL;

        output = Math.abs(rL - rB) + Math.abs( cL - cB) - 1;

        if( rL == rB){//they're on the same row
            output = Math.abs(cL - cB) - 1;
            boolean rockInBetween = false;
            if(rR == rB){
                if((EW == 'W' && cB<cR && cR<cL) || (EW == 'E' && cL<cR && cR<cB)){
                    rockInBetween = true;
                }
            }
            if( rockInBetween){//the rock's on the way and inbetween the B and L!!
                output += 2;
            }
        }
        if( cL == cB && Math.abs(rL-rR)<Math.abs(rL-rB)){//they're on the same collumn
            output = Math.abs(rL - rB) - 1;
            boolean rockInBetween = false;
            if(cR == cB){
                if((NS == 'N' && rB<rR && rR<rL) || (NS == 'S' && rL<rR && rR<rB)){
                    rockInBetween = true;
                }
            }
            if(rockInBetween){//the rock's on the way
                output += 2;
            }
        }

        out.println(output); //CONTEST
        out.close();
//        System.out.println(output);
    }
}
