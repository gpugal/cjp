/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package y2017.QR;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author pugal
 * @date 8 Feb, 2018 - 4:45:47 PM
 */
public class OversizedPancakeFlipper {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int caseCnt = sc.nextInt();
        for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
            pw.print("Case #" + (caseNum + 1) + ": ");
            new OversizedPancakeFlipper().solve(sc, pw);
        }
        pw.flush();
        pw.close();
        sc.close();
    }

    private void solve(Scanner sc, PrintWriter pw) {
        String pCakes = sc.next();
        int S = pCakes.length();
        int k = sc.nextInt();
        int count = 0;
        boolean fliped = false;
        int flipedCount = 0;
        for (int i=0; i<S; ++i) {
            char c = pCakes.charAt(i);
            if (!fliped && c ==  '-') {
                count++;
                flipedCount = k-1;
                fliped = !fliped;
            }
            if (fliped && c == '+') {
                count++;
                flipedCount = k-1;
                fliped = !fliped;
            }
                
                if (c == '+') {
                    count ++;                    
                }
                fliped--;
            }
        }
        pw.print(count);
    }
}
