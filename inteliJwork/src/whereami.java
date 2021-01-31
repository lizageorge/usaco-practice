/*
ID: liza1
LANG: JAVA
TASK: whereami
 */

import java.io.*;
import java.util.*;

class whereami {
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\1.in"));
        BufferedReader f = new BufferedReader(new FileReader("herding.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));


        int n = Integer.parseInt(f.readLine());
        String inputS = f.readLine();
        char[] input = inputS.toCharArray();

        int outputK =0;


        for (int k = 2; k <= n ; k++) {
            boolean thisKWorks = true;
            for(int j = 0; j <= n-k; j++){
                String test = inputS.substring(j, j + k );
//                System.out.println(test);
                for(int i = 0; i < n - k; i ++){
                    if( i != j && (test.equals(inputS.substring(i, i+k)))){
                        thisKWorks = false;
                        break;
                    }
                }
            }
            if (thisKWorks == true){
                outputK = k;
                break;
            }
        }

//        System.out.println(outputK);
        out.println(outputK);
        out.close();

    }
}

