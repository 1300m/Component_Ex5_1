/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreevent;

import java.util.Scanner;

/**
 *
 * @author 64050355 Jirapat Pichai
 */
public class LiveScoreEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource obj = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        obj.addScoreListener(sub1);
        obj.addScoreListener(sub2);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Score: ");
        String scoreLine = in.nextLine();
        while(!scoreLine.equals("")) {
           obj.setScoreLine(scoreLine);
           System.out.print("Enter Score: ");
           scoreLine = in.nextLine();
       }
        in.close();
    }
    
}
