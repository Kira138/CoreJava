package nonstaticmethods;

public class Laptop {
	String brand;
	String colour;
	double price;
	int ram;
	
	Laptop(String brand,String colour,double price,int ram)
	{
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.ram=ram;
	}
	//override toString()
		public String toString()
		{
			return "Brand: "+brand+" Colour: "+colour+"Price: "+price+"Ram: "+ram;
			
			
		}
		//overridden equals:
		public boolean equals (Object o) {
			Laptop l=(Laptop)o;
			return this.brand==brand &&
					this.colour==colour &&
			        this.price==price&&
			         this.ram==ram;
		}
		//overridden hashCode:
		public int hashCode() {
			double hc=0;
			hc=hc+brand.hashCode();
			hc=hc+colour.hashCode();
			hc=hc+(double)price;
			hc=hc+(int)ram;
			return (int) hc;
		}

	}

	


