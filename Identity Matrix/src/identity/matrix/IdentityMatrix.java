/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identity.matrix;
import java.util.*;
/**
 *
 * @author ERIC
 */
public class IdentityMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner s = new Scanner(System.in);
       
       System.out.print ("Enter How many Rows: ");
        int num = s.nextInt();
        
        for(int row = 0; row< num; row++){
            
            for(int a = 0; a< num; a++){
                if (row == a){
                    System.out.print(1+"");
                }
                else
                {
                    System.out.print(0+"");
                }
            }
            System.out.println("");
        }
    
  }
}
