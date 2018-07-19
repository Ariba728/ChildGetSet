
package Child;

public class PersonModel {

	public static void main(String[] args) {
		
            
            Person child = new Person();
            String FirstName = child.getName();
            String LastName = child.getLastName();
            String Address = child.getAddress();
            String Mother_Iris = child.getMiris();
            String Father_Iris = child.getFiris();
            char gender = child.getGender();
            
            child.setName("Ariba");
            child.setlastName("Khan");
            child.setaddress("Goa"); 
            child.setMiris("Black");
            child.setFiris("Black");
            child.setGender('M');
            System.out.println("The details of child are :");
            System.out.println("Name:" +child.firstname+" "+child.lastName);
            System.out.println("Address :" +child.address);
            
            child.Color_Of_Iris(child.miris, child.gender,child.firis);
            

	}

  

}
