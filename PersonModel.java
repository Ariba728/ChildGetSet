package Child;

public class PersonModel {

	public static void main(String[] args) {

            Person child = new Person();
            
            String FirstName = child.getName();
            char gender = child.getGender();
            child.setName("Ariba");
            child.setGender('F');
           
            Person father = new Person();
            String LastName = father.getLastName();
            String Address = father.getAddress();
            father.setlastName("Khan");
            father.setaddress("Mumbai"); 
            father.setIris("Black");

            Person mother=new Person();
            mother.setIris("Blue");
            
            
            System.out.println("The details of child are :");
            System.out.println("Name:" +child.firstname+" "+father.lastName);
            System.out.println("Address :" +father.address);
            
            child.setFather(father);
            child.setMother(mother);
            child.Color_Of_Iris();
            

	}

  

}
