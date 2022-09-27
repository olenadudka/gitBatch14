package HW;

public class Phone {
	
String made;
String color;
double price;
String weight;
String model;


void call(){
	System.out.println("The phone "+made+ " can make a calls.");
}
void takePictures() {
	System.out.println("The phone "+made+" "+model+" can take a pictures");
}

	public static void main (String[] args) {
	Phone iPhone=new Phone();
	iPhone.made="Apple";
	iPhone.price=800.00;
	iPhone.model="IPhone 5";
	iPhone.color="black";
	System.out.println("The phone "+iPhone.model+" has "+iPhone.color+" color and costs "+iPhone.price);
	iPhone.takePictures();
	System.out.println("______________________");
	
	Phone Samsung=new Phone();
	Samsung.made="Samsung";
	Samsung.model="Samsung Galaxy S8";
	Samsung.color="grey";
	Samsung.takePictures();
	Samsung.call();
	System.out.println("______________________");
	
	Phone Pixel=new Phone();
	Pixel.made="Pixel";
	Pixel.model="Pixel 5";
	Pixel.color="black";
	Pixel.call();
}


}
