package calculatingcomputer;
import java.util.Scanner;

public class Computercalculation {

	public static void main(String[] args) { 
		Computercalculation2 abc = new Computercalculation2();
		
		Scanner scan = new Scanner(System.in);
		
		//Cost
		System.out.println("What is the total cost of your computer?");
		abc.setCost(scan.nextDouble());
		System.out.println(abc.getCost());
		
		//Time
		System.out.println("How many months do you intend to keep the computer? (max 180 months)");
		abc.setTime(scan.nextDouble());
		System.out.println(abc.getTime());
		 
		//Hours
		System.out.println("How many hours do you use the computer per day?");
		abc.setawake(scan.nextDouble());
		System.out.println(abc.getawake());
		 
		//Sleep
		System.out.println("Laptop or Desktop? ");
		abc.setLaptop(scan.next());
		System.out.println(abc.getLaptop());
		
		//Screen Size
		System.out.println("Size of Screen (in pixels:500000, 1000000, 1500000, 2000000, 2500000, 3000000, 3500000, 4000000, 4500000, 5000000 ");
		abc.setSize(scan.nextInt()); 
		System.out.println(abc.getSize());
				
		System.out.println("Type of CPU:IntelLowEnd, IntelMidEnd, IntelHighEnd, IntelTopEnd, AMDLowEnd, AMDMidEnd or AMDHighEnd?");
		abc.setcpu(scan.next());
		System.out.println(abc.getcpu());
		
		//MB
		System.out.println("What is the MB of your ram? (DDR1, DDR2, DDR3)");
		abc.setmb(scan.next());
		System.out.println(abc.getmb());
		
		//Disk
		System.out.println("What is your hard disk (SSD, HDD2.5 or HDD3.5)?");
		abc.setdisk(scan.next());
		System.out.println(abc.getdisk());
		  
		//Mouse
		System.out.println("Does the mouse need battery?");
		abc.setMouse(scan.next());
		System.out.println(abc.getMouse());
		 
		//Country
		System.out.println("What state do you live in (in abbreviation) (eg.New York = NY)?");
		abc.setCountry(scan.next());
		System.out.println(abc.getCountry());
		
		
		if(abc.getLaptop().equalsIgnoreCase("laptop") && abc.getTime() >= 42){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 50);
			
		}
		
		if(abc.getLaptop().equalsIgnoreCase("laptop") && abc.getTime() >= 84){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 50);
			
		}
		
		if(abc.getLaptop().equalsIgnoreCase("laptop") && abc.getTime() >= 126){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 50);
			
		}
		
		if(abc.getLaptop().equalsIgnoreCase("laptop") && abc.getTime() >= 168){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 50);
			
		}
		
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 18){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 36){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 54){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 72){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 90){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 108){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 126){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 144){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 162){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		if(abc.getMouse().equalsIgnoreCase("yes") && abc.getTime() >= 180){
			abc.setTotalBatteryCost(abc.getTotalBatteryCost() + 3.5);
		}
		
		
		if(abc.getSize() == 500000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 20);
		}
		
		if(abc.getSize() == 1000000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 24);
		}
		
		if(abc.getSize() == 1500000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 27);
		}
		
		if(abc.getSize() == 2000000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 31);
		}
		
		if(abc.getSize() == 2500000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 35);
		}
		
		if(abc.getSize() == 3000000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 40);
		}
		
		if(abc.getSize() == 3500000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 45);
		}
		
		if(abc.getSize() == 4000000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 51);
		}
		
		if(abc.getSize() == 4500000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 58);
		}
		
		if(abc.getSize() == 5000000 ){
			abc.setElectricityUse(abc.getElectricityUse() + 65);
		}
		
		if(abc.getmb().equalsIgnoreCase("DDR1")){
			abc.setElectricityUse(abc.getElectricityUse() + 5);
		}
		
		if(abc.getmb().equalsIgnoreCase("DDR2")){
			abc.setElectricityUse(abc.getElectricityUse() + 4);
		}
		
		if(abc.getmb().equalsIgnoreCase("DDR3")){
			abc.setElectricityUse(abc.getElectricityUse() + 2.5);
		}
		
		if(abc.getdisk().equalsIgnoreCase("SSD")){
			abc.setElectricityUse(abc.getElectricityUse() + 1.7);
		}
		
		if(abc.getdisk().equalsIgnoreCase("HDD2.5")){
			abc.setElectricityUse(abc.getElectricityUse() + 1.85);
		}
		
		if(abc.getdisk().equalsIgnoreCase("HDD3.5")){
			abc.setElectricityUse(abc.getElectricityUse() + 7.75);
		}
		
		if(abc.getcpu().equalsIgnoreCase("IntelLowEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 64);
		}
		
		if(abc.getcpu().equalsIgnoreCase("IntelMidEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 84);
		}
		
		if(abc.getcpu().equalsIgnoreCase("IntelHighEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 86);
		}
		
		if(abc.getcpu().equalsIgnoreCase("IntelTopEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 140);
		}
		
		if(abc.getcpu().equalsIgnoreCase("AMDLowEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 80);
		}
		
		if(abc.getcpu().equalsIgnoreCase("AMDMidEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 95);
		}
		
		if(abc.getcpu().equalsIgnoreCase("AMDHighEnd")){
			abc.setElectricityUse(abc.getElectricityUse() + 110);
		}
		
		if(abc.getCountry().equalsIgnoreCase("WA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*7.15*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("AL")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.3*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("AR")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*7.85*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("AZ")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.24*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("CA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*15.23*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("CO")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.04*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("CT")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*16.98*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("DE")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*11.33*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("FL")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.86*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("GA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.94*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("IA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.24*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("ID")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*7.95*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("IL")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.87*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("IN")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.97*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("KS")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.04*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("KY")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.13*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("LA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.11*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*15.34*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MD")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*12.12*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("ME")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*12.66*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MI")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*11.1*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MN")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.63*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MO")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.06*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MS")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.66*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("MT")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.62*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NC")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.32*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("ND")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.49*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NE")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.80*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NH")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*15.25*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NJ")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*14.01*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NM")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*6.69*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("NY")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*16.25*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("OH")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.97*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("OK")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.1*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("OR")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.78*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("PA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.29*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("RI")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*15.57*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("SC")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.56*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("SD")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.06*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("TN")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.5*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("TX")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.99*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("UT")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*8.41*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("VA")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*9.25*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("VT")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*14.58*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("WI")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*10.73*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("WV")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*7.65*30*abc.getTime());
		}
		
		if(abc.getCountry().equalsIgnoreCase("WY")){
			abc.setTotalElectricityCost(((abc.getElectricityUse() * abc.getawake())/1000)*7.78*30*abc.getTime());
		}
		
		
		//Computer Cost
		System.out.println("Computer Cost: " + abc.getCost());
		
		//Cost of Electricity
		System.out.println("Electricy Cost: " + abc.getTotalElectricityCost());
		
		//Cost of Battery
		System.out.println("Battery Cost: " + abc.getTotalBatteryCost());
		
		//Cost of Total 
		double total = abc.getCost() + abc.getTotalElectricityCost() + abc.getTotalBatteryCost();
		System.out.println("Total Cost: " + total);
		
	}

}
