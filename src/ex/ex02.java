package ex;

/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		float n = scn.nextInt();
		if (n <= 120) {
			System.out.println("夏月 :" + n * 2.1);
			System.out.println("非夏月:" + n * 2.1);
		} else if (n >= 121 && n <= 330) {
			float m = n - 120;
			float n1 = (float) ((120 * 2.1) + (m * 3.02));
			float n2 = (float) ((120 * 2.1) + (m * 2.68));
			System.out.println("夏月 :" + n1);
			System.out.println("非夏月 :" + n2);
		} else if (n >= 331 && n <= 330) {
			float m = n - 330;
			float n1 = (float) ((120 * 2.1) + (210 * 3.02) + (m * 4.39));
			float n2 = (float) ((120 * 2.1) + (210 * 2.68) + (m * 3.61));
			System.out.println("夏月 :" + n1);
			System.out.println("非夏月 :" + n2);
		}else if(n>=501 && n<=700){
			float m = n - 500;
			float n1 = (float) ((120 * 2.1) + (210 * 3.02) + (170 * 4.39)+(m*4.97));
			float n2 = (float) ((120 * 2.1) + (210 * 2.68) + (170 * 3.61)+(m*4.01));
			System.out.println("夏月 :" + n1);
			System.out.println("非夏月 :" + n2);
		}else if(n>700){
			float m = n - 700;
			float n1 = (float) ((120 * 2.1) + (210 * 3.02) + (170 * 4.39)+(200*4.97)+(m*5.63));
			float n2 = (float) ((120 * 2.1) + (210 * 2.68) + (170 * 3.61)+(200*4.01)+(m*4.5));
			System.out.println("夏月 :" + n1);
			System.out.println("非夏月 :" + n2);
		}
	}

}
