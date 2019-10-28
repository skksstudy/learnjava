import java.util.Scanner;
public class Circlecir{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the r: ");
		double radius=input.nextDouble();
		double area;
		area=radius*radius*3.14159;
		System.out.println("the"+radius+"is"+area);
	}
}