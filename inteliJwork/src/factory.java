/*
ID: liza1
LANG: JAVA
TASK: factory
*/

import java.util.*;
import java.io.*;

public class factory { //be sure that the class name also lines up perfectly with the problem name!!
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\herding.in")); //TEST
        BufferedReader f = new BufferedReader(new FileReader("herding.in")); //CONTEST
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("factory.out"))); //CONTEST

        StringTokenizer st;

        int n = Integer.parseInt(f.readLine());
        int output = 100000;

        int[][] input = new int[n-1][2];

        for(int m = 0; m < n-1; m++){
            st = new StringTokenizer(f.readLine());
            input[m][0] = Integer.parseInt(st.nextToken()); //ai
            input[m][1] = Integer.parseInt(st.nextToken()); //bi
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

        for (int b = 0; b < input.length; b++) {
            int tb = input[b][1];
            int testOut = 100000;
            boolean result = true;

            innerloop:
            for (int a = 0; a < input.length; a++) {
                int ta = input[a][0];
                result = getTAtoTB(a, input, ta, tb);
                if(!result){
                    break innerloop;
                }
            }
            if(result){
                testOut = tb;
            }
            if(testOut < output){
                output = testOut;
            }
        }

//        while(f.ready()){
//
//        }

        if(output == 100000){
            output = -1;
        }
//        System.out.println(output); //TEST
        out.println(output); //CONTEST
        out.close();
    }

    private static boolean getTAtoTB(int a, int[][] input, int ta, int tb) {
        boolean result;
        if(input[a][1] == tb){
            result = true;
        }else{
            //find the index where input[a][1] is an ai
            int tk = 999;
            for (int k = 0; k < input.length; k++) {
                if(input[a][1] == input[k][0]){
                    tk = k;
                }
            }
            if(tk == 999){
                result = false;
            }else{
                result = getTAtoTB(tk, input, input[tk][0], tb);
            }

            //check again
        }
        return result;
    }
}
