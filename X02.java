// 12S22027 - Ferry Panjaitan 
// 12S22038 - Ade Yohana Azeka Siahaan
import java.util.*;
import java.lang.Math;

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        
        room(buddy);
    }
    
    public static void room(String[] buddy) {
        String[] ssbuddy = new String[4];
        int i;
        
        buddy[0] = input.nextLine();
        if (buddy[0].equals("---")) {
            buddy[0] = " ";
        } else {
            buddy[1] = input.nextLine();
            if (buddy[1].equals("---")) {
                buddy[1] = " ";
                for (i = 0; i <= 0; i++) {
                    System.out.println(buddy[i]);
                }
            } else {
                buddy[2] = input.nextLine();
                if (buddy[2].equals("---")) {
                    buddy[2] = " ";
                    for (i = 0; i <= 1; i++) {
                        System.out.println(buddy[i]);
                    }
                } else {
                    buddy[3] = input.nextLine();
                    if (buddy[3].equals("---")) {
                        buddy[3] = " ";
                        for (i = 0; i <= 2; i++) {
                            System.out.println(buddy[i]);
                        }
                    } else {
                        for (i = 0; i <= 3; i++) {
                            System.out.println(buddy[i]);
                        }
                    }
                }
            }
        }
    }
}
