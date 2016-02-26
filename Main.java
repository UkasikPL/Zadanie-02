/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author ukasi
 */
public class Zadanie2 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int SaveNumber;
    static Random Generate = new Random();
    static boolean DebugMode;

    public static void main(String[] args) throws IOException {
        DebugMode = true;
        while(true)
        {
            int a;
            System.out.print("Zgadnij liczbę: ");
            a = Generate.nextInt(11);
            if(DebugMode)
                System.out.println(" ("+a+") ");
            try
            {
                SaveNumber = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Podana wartość nie jest liczbą, lub jest za duża !");
            }
            if(SaveNumber==a)
                System.out.println("Gratulacje ! Udało ci się zgadnąć");
            else
                System.out.println("Przykro ! Nie udało ci się zgadnąć");
        }
    }
    
}
