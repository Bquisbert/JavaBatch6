package REPLHW;

public class Repl102 {
//
//Create a class named 'Main' with specific attributes.
//Create two objects of that class in which you will be assigning the following values and then print them.
//carColor='Black'
//carYear=2019
//carMake='BMW'
//
//carColor='White'
//carYear=2018
//carMake='Toyota'
//
//Expected Output:
//Car color is Black and car model is BMW year is 2019 and car name is BMW
//Car color is White and car model year is 2018 and car name is Toyota

String carColor;
int carYear;
String carMake;
public static void main(String[] args) {
	
Repl102 obj=new Repl102();

obj.carColor="Black";
obj.carYear=2019;
obj.carMake="BMW";
System.out.println("Car color is "+obj.carColor+" and car model is "+obj.carMake+ " year is "+obj.carYear+ " and car name is "+ obj.carMake);


Repl102 car2=new Repl102();

car2.carColor="White";
car2.carMake="Toyota";
car2.carYear=2018;

System.out.println("Car color is "+car2.carColor+" and car model is "+car2.carMake+ " year is "+car2.carYear+ " and car name is "+ car2.carMake);


}



}
