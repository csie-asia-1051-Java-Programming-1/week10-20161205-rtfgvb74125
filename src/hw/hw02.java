package hw;
/*
 * Topic: 有一種坊間常見的遊戲稱為 "18 啦 "~ 玩法介紹 : 由四個骰子來擲，只要其中任兩 個是相同點，才開始計算點數，點數即為另兩個點數相加，若另兩個也一樣，則取較 大的一組相加，另外有下列幾種特殊情況:
擲出 4 顆骰子點數均相同，稱為通殺 !
任三顆點數相同或四顆點數均不相同，即為無意義 ! 請寫一程式，各別輸入四顆骰子點數，判斷結果 !

 * Date: 2016/12/05
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		if(a==b && a==c && a==d && b==c && b==d && c==d ){
			System.out.println("通殺");
		}else if(a==b  && c==d){
			a = a*2;
			c = c*2;
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else if(a==c && b==d){
			a = a*2;
			b = b*2;
			if(a>b){
				System.out.println(a);
			}else{
				System.out.println(b);
			}
		}else if(a==d && c==b){
			a = a*2;
			c = c*2;
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
			
		}else{
			System.out.println("R");
		}
	}

}
