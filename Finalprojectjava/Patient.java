package Finalprojectjava;
import java.util.Scanner;

public class Patient extends Person {
	 private String  disease, sex, admit_status;
	    private String age;


	 

	    public String getDisease() { return disease; }
	 

	    public String getSex() { return  sex; }
	 

	    public String getAdmit_status() { return admit_status; }
	     public String getAge() { return age; }


	 

	    public void setDisease(String disease)
	    {
	        this.disease = disease;
	    }
	 

	    public void setSex(String sex) { this.sex =  sex; }
	 
	    public void setAdmit_status(String admit_status) { this.admit_status =  admit_status; }
	    public void setAge(String age) { this.age =  age; }


	    public void displaypatient() {
	        super.showperson();

	        System.out.print( this.disease+"\t\t");
	        System.out.print(this.sex+"\t\t");
	       System.out.print(this.admit_status+"  \t\t");
	       System.out.print(this.age+"\t\t");
	        System.out.println("\n");

	    }

	    void new_patient()
	    {

	        Scanner input = new Scanner(System.in);

	        System.out.println("ID:-");
	        id=input.nextLine();
	        System.out.println("Name:-");
	        name=input.nextLine();
	        System.out.print("Disease:-");
	        disease = input.nextLine();
	        System.out.print("Sex:-");
	        sex = input.nextLine();
	        System.out.print("Admit Status:-");
	        admit_status = input.nextLine();
	        System.out.print("Age.:-");
	        age = input.nextLine();
	    }
}
