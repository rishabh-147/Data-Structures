package Maps;

import java.util.Objects;

/*
 * In this class we will see how Object.hashFunctions() and Object.equals() functions are override. 
 * Important point to know is that the Object class is the Parent class of all the objects in java. 
 */
public class hashFunctionandEquals {

	public static void main(String[] args) {
		//Now, if we create two object of the pen class
		Pen pen1 = new Pen(10, "BLUE");
		Pen pen2 = new Pen(10, "BLUE");
		
		//WE CAN SEE THAT BOTH THE OBJETS HAVE THE SAME VALUE SO THEY MUST BE EQUAL BUT dude!!!
//REMOVE_1		System.out.println(pen1.equals(pen2)); //output: false
		//But why??? that's coz both have a different hashCode(); LOL!!!
//Remove2:		System.out.println(pen1.hashCode()+"\n"+pen2.hashCode());//see both have different hashCodes.
		/*
		 * So in order to make them equal we have to define a new equals() and hashCode() function for "Pen" class.
		 * In Eclipse we can use the given option of "Generate hashCode() and Equals()" if u click on source option. 
		 * 
		 * Now, if I compare both the objects of the Pen class
		 */
		System.out.println(pen1.equals(pen2)); //output: true		
}
	
	//INNER CLASS
	public static class Pen
	{
		String color;
		int  price;
		
		public Pen(int price, String color)
		{
			this.color = color;
			this.price = price;
			
		}
		
		//GENERATED BY ECLIPSE: OVERRINDING THE equals() and hashCode() function of Pen objects.

		@Override
		public int hashCode() {
			return Objects.hash(color, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)   //chechs if both the objects are refer to the same memory
				return true;
			if (obj == null)	//checks if the other object is null
				return false;
			if (getClass() != obj.getClass())  //if both the objects are from different class
				return false;
			Pen other = (Pen) obj;  //(Pen) obj --> type casting "obj" into Pen object
			return Objects.equals(color, other.color) && price == other.price;
		}
		
		
	}


	}
