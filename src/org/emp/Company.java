package org.emp;

public class Company extends Employee {

	
	 public Company() {
		 super(307.777f);
		 System.out.println("child default constructor");
	 
	 }
	 	public Company (String name) {
	 		this ("chennai",3453625);
	 		System.out.println("String para conc."+name);
	 		
	 	}
	 	
	 	public Company(String city, int id) {
	 		System.out.println("string int para conc"+city+"/t"+id);
	 		
	 	}
	 	public static void main(String[] args) {
			Company c=new Company();
			Company c1=new Company("ajai");
			
			
		}
	 	
	 	public void test() {
	 			System.out.println("motta boss");
		}


}
