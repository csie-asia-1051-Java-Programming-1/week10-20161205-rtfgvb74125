
package ex;
import java.util.Scanner;


public class personooex03  {
	String name,sex;
	float hight,weight;
	
	public personooex03(String name1,String sex1,float hight1,float weight1){
		this.name = name1;
		this.sex = sex1;
		this.hight = hight1;
		this.weight = weight1;
	}
	
	public void show(){
		System.out.println(name+"\t"+sex+"\t"+hight+"\t"+weight+"\t"+(weight/Math.pow(hight, 2)));
	}
	public float BMI(){
		float BMI = weight/(float) Math.pow(hight, 2);
	return BMI;
	}
	
}
