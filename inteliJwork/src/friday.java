/*
ID: liza1
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

class friday {
    public static void main(String[] args) throws IOException {
//        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\friday.in.txt"));
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

//        int input = f.read();
        int input = 0;
        while(f.ready()){
            input = Integer.parseInt(f.readLine());
            System.out.println(input);

            int sat = 0; //1
            int sun = 0; //2
            int mon = 0; //3
            int tue = 0; //4
            int wed = 0; //5
            int thu = 0; //6
            int fri = 0; //7

            int day = 2;

            for (int j = 1900; j <= 1900 +input-1; j++) {
                if(j % 4 == 0 && (j % 100 != 0 || j % 400 == 0)){
                    //is a leap year, excluding centuries that aren't divisible by 400
//                int date = 1;

                    //January
                    for (int i = 1; i <= 31; i++) {
//                    date++;
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //February
                    for (int i = 1; i <= 29; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //March
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //April
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //May
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //June
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //July and August
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //September
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //October
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //November
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //December
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                }
                else{
                    //not a leap year
                    //January
                    for (int i = 1; i <= 31; i++) {
//                    date++;
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //February
                    for (int i = 1; i <= 28; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //March
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //April
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //May
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //June
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //July and August
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //September
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //October
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //November
                    for (int i = 1; i <= 30 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                    //December
                    for (int i = 1; i <= 31 ; i++) {
                        day++;
                        if(day == 8){
                            day = 1;
                        }
                        if( i == 13) {
                            switch (day){
                                case 1: sat++; break;
                                case 2: sun++; break;
                                case 3: mon++; break;
                                case 4: tue++; break;
                                case 5: wed++; break;
                                case 6: thu++; break;
                                case 7: fri++; break;
                            }
                        }
                    }
                }
            }

            //outputting
//            System.out.println("expected output \n" + "36 33 34 33 35 35 34");
//            System.out.println( sat + " " + sun + " " + mon  + " " + tue  + " " + wed  + " " + thu  + " " +fri);
        out.println( sat + " " + sun + " " + mon  + " " + tue  + " " + wed  + " " + thu  + " " +fri);
        }

        out.close();
    }

}
