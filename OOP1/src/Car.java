import javax.swing.JOptionPane;


public class Car {
	private int yearModel; 
	private String model;   
	private int speed; 
	public Car(){  
		 		 
		       yearModel=0;	
		       model="";
		       speed=0;
		
	}

	public Car(int newYearModel, String newModel, int newSpeed){  
		 
	       yearModel=newYearModel;	
	       model=newModel;
	       speed=newSpeed;
	
   }
	public int getYearModel(){
		return yearModel;
	}
	public String getModel(){
		return model;
	}
	public int getSpeed(){
		return speed;
	}

	public void setYearModel(int newYearModel){
		yearModel = newYearModel;
	}
	public void setModel(String newModel){
		  model=newModel;
	}
	public void setSpeed(int newSpeed){
		speed= newSpeed;
	}
	
    public void AccelerateSpeed (int speed)
    {
            speed = speed + 5;
    }
    public String toSrting(){
		return getClass().getName() + '@' + getClass().hashCode();
	}
    
    public static void main(String[] args) {
       Car myCar = new Car ();
       myCar.model = "Honda";
       myCar.speed = 150;
       myCar.yearModel = 2010;
       int speed = myCar.getSpeed();
       speed = 160;
       System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getModel() +
                  " " + "is going " );
       myCar.AccelerateSpeed(speed);
       System.out.println("Your Speed now is: " + speed);
       Car newAudi = new Car(2014, "AudiA7", 250);
       System.out.println(newAudi.toString());


   }

}
