///*
//ID: liza1
//LANG: JAVA
//TASK: beads
//*/
//
////https://train.usaco.org/usacogate?a=MtNe9oU2hvv
////liza1
//
//import java.util.*;
//import java.io.*;
//
//public class beads {
//    public static void main(String[] args) throws IOException {
////        BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\bead.in.txt")); //TEST
//        BufferedReader f = new BufferedReader(new FileReader("beads.in")); //beads.out"))); //CONTEST
//
////        StringTokenizer st;
//
//        int n = Integer.parseInt(f.readLine());
//        String inputS = f.readLine();
//        char[] input = inputS.toCharArray();
////        System.out.println(inputS);
//
//        int output = 0;
//        int testOutput = 0;
//        int outputRight = 0;
//        int outputLeft = 0;
//
//        //so uh i'm just going to hardcode for what to do if it's all just one letter
//
//        char[] hardw = new char[n];
//        for (int i = 0; i < n; i++) {
//            hardw[i] = 'w';
//        }
//        char[] hardb = new char[n];
//        for (int i = 0; i < n; i++) {
//            hardb[i] = 'b';
//        }
//        char[] hardr = new char[n];
//        for (int i = 0; i < n; i++) {
//            hardr[i] = 'r';
//        }
//
//        if(Arrays.equals(hardr, input) || Arrays.equals(hardb, input) || Arrays.equals(hardw, input)){
//            output = n;
//        }
//        else{
//            for(int i = 0; i < n; i++){ //testing every starting index
//
//                //test going right
//                outputRight = 1;
//
//                int startingIndexR = i;
//
//                //checking if the first char is 'w'
//                if(input[startingIndexR] == 'w'){
//                    outputRight++;
//                    //iterate till i find the first non-w char
//                    int w = 1;
//                    while(input[startingIndexR + w] == 'w'){
//                        outputRight++;
//                        w++;
//                    }
//
//                    startingIndexR = startingIndexR + w;
//                }
//
//
//                char fbr = input[startingIndexR];
//
//                for(int j = 1; j < n; j++){
//                    char sb = input[ (startingIndexR + j) % n];
//                    if(fbr == sb || sb == 'w'){
//                        outputRight++;
//                    }
//                    else {
////                    System.out.println(j);
//                        break;
//
//                    }
//                }
//
//
//                //test going left
//                outputLeft = 0;
////            int startingIndexL = i;
//                int leftIndex;
//                if( i != 0){
//                    leftIndex = i-1;
//                }else{
//                    leftIndex = n-1;
//                }
//
//
//                //if i was not given the test data, i wouldn't know to fix this...
//                if(outputRight != n){
//                    outputLeft = 1;
//
//                    //testing for if the first character is a w
//                    if(input[leftIndex] == 'w'){
////                        outputLeft++;
//                        //iterate till i find the first non-w char
//                        int w = leftIndex - 1;
//                        if(w < 0){
//                            w = n + w;
//                        }
//                        while(input[w] == 'w'){
//                            outputLeft++;
//                            w--;
//                            if(w < 0){
//                                w = n + w;
//                            }
//                        }
//
//                        leftIndex = leftIndex - w;
//                    }
//                    if(leftIndex < 0){
//                        leftIndex = n + leftIndex;
//                    }
//
//
//                    char fbl = input[leftIndex];
//
//                    for(int j = 1; j < n; j++){
//                        int testLeftIndex;
//                        if(leftIndex - j >= 0){
//                            testLeftIndex = leftIndex - j;
//                        }
//                        else {
//                            testLeftIndex = n - j;
//                        }
//
//                        //making sure this iterator doesn't cross back into the right starting index
//                        if(testLeftIndex >= i){
//                            break;
//                        }
//
//                        char sb = input[ testLeftIndex];
//                        if(fbl == sb || sb == 'w'){
//                            outputLeft++;
//                        }
//                        else {
//                            break;
//                        }
//                    }
//                }
//
//
//                testOutput = outputRight + outputLeft;
//                if(testOutput > output){
//                    output  = testOutput;
//                }
//            }
//        }
//
//
////        System.out.println(output); //TEST
//        out.println(output); //CONTEST
//        out.close();
//    }
//}
