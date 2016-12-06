package ex;
/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 105021056 王家恩
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "y";
		ArrayList<personooex03> arr = new ArrayList<personooex03>();
		while(x.equals("y")||x.equals("Y")){
			Scanner scn = new Scanner(System.in);
			
			String name = scn.next();
			String sex = scn.next();
			int hight = scn.nextInt();
			int weight = scn.nextInt();
			
			personooex03 stu = new personooex03(name,sex,hight,weight);//創新的person"框架"
			arr.add(stu);//把stu放入ArrayList
			System.out.println("Continue(y/n)");
			x = scn.next();
			
			float BMI[] = new float[arr.size()];
			for(int i =0;i<arr.size();i++){
				personooex03 s = arr.get(i);//s為物件名稱
				float Z = s.BMI();//X存拿出的BMI
				BMI[i] = Z;
			}
			//排序for(int i = 0;i<arr.size();i++){
				
			//}
			for(int i = 0;i<BMI.length;i++){//拿出排列好的BMI
				for(int j = 0;j<arr.size();j++){//拿出student裡面的BMI
					personooex03 ss = arr.get(j);
					float X = ss.BMI();//等同40行
					if(BMI[i]==X){
						ss.show();
					}
				}
			}

		}
		
		
	}

}
