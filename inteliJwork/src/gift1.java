/*
ID: liza1
LANG: JAVA
TASK: gift1
 */

import java.io.*;
import java.util.*;

class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader(   "C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\gift1.in.txt"));
//        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        StringTokenizer st;

        int np = Integer.parseInt(f.readLine());

        Person[] people = new Person[np];
        for (int i = 0; i < np; i++) {
            String name = f.readLine();
            people[i] = new Person(name);

        }

        while(f.ready()){
            String fromName = f.readLine();
            st = new StringTokenizer(f.readLine());
            int giftTotal = Integer.parseInt(st.nextToken());
            int receivers = Integer.parseInt(st.nextToken());

            int i = 99;
            for(int j = 0; j < np; j++){
                if(people[j].name.equals(fromName)){
                    i = j;
                    break;
                }
            }

            if ( receivers != 0){
                int gift = (int)Math.floor(giftTotal/receivers);
                people[i].account = people[i].account + gift*receivers*-1;

                for(int j = 0; j < receivers; j++){
                    String r = f.readLine();
                    int index = 0;
                    for(int k = 0; k < people.length; k++){
                        if(people[k].name.equals(r)){
                            index = k;
                            break;
                        }
                    }
                    people[index].account += gift;
                }
            }
        }


        //outputting
        for( Person p : people){
            System.out.println(p.name + " " + p.account);
//            out.println(p.name + " " + p.account);
        }

//        out.close();
    }
}


class Person {
    String name;
    int account;

    public Person(String n){
        name = n;
        account = 0;
    }
}