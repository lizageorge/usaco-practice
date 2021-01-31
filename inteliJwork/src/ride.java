/*
ID: liza1
LANG: JAVA
TASK: ride
 */

import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
//        BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\lizag\\OneDrive\\Documents\\USACO\\USACO Training inputs\\ride.in.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));


        String cometNameS = f.readLine();
        char[] cometName = cometNameS.toCharArray();
        int cometInt = 1;
        for (int i = 0; i < cometName.length; i++) {
            cometInt = cometInt*("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cometName[i]) + 1);
        }

        String groupNameS = f.readLine();
        char[] groupName = groupNameS.toCharArray();
        int groupInt = 1;
        for (int i = 0; i < groupName.length; i++) {
            groupInt = groupInt*("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(groupName[i]) + 1);
        }

        if(cometInt%47 == groupInt%47){
                out.println("GO");
            }
            else{
                out.println("STAY");
            }

      out.close();
    }
}
