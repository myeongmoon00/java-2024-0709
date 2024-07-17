package we;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        
        for(int i = 0; i < a.length(); i++)
        {
            if(a.isUpperCase()){
                ch = a.toLowerCase();
            }else{
                ch = Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
	}

}
