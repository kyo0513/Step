import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		System.out.print("何段>>");
		int row = new Scanner(System.in).nextInt();
		for(int i = 0;i < row ; i++){
			for(int j = 0 ; j < i + 1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("//逆");
		for(int i = 0;i < row ; i++){
			for(int j = 0; j < row ; j++){
				System.out.printf(j < i ? " ":"*");
			}
			System.out.println();
		}
		for(int i =0;i < 3;i++){
			System.out.printf(i%2 == 0 ? "X X%n" : " X %n");
		}
	}
}
