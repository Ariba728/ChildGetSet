package Child;

public class Person {
	String firstname;
	String lastName;
	String address;
	char gender;
	String iris;
	String firis;
        String miris;
        public String getName(){
        return firstname;
        }
        public String getLastName()
        {
        return lastName;
         }
        public String getAddress()
        {
        return address;
        }
        public String getMiris()
        {
        return miris;
        }
         public String getFiris()
        {
        return firis;
        }
         public char getGender()
         {
         return gender;
         }
        public void setName(String firstname) {
                  this.firstname= firstname;
                }
        public void setlastName(String lastname) {
                  this.lastName= lastname;
                }
        public void setaddress(String address) {
                  this.address= address;
                }
        public void setMiris(String miris) {
                  this.miris= miris;
                }
        public void setFiris(String firis) {
                  this.firis= firis;
                }
         public void setGender(char gender) {
                  this.gender= gender;
                }
         public void Color_Of_Iris(String mother_iris,char gender, String father_iris)
         
         {
              if(mother_iris.equals(father_iris))
                {
                   if(gender == 'M'){
                iris = "Brown";
                }
                   else if(gender=='F')
                   {
                       iris= "Not defined";
                 
                   }
                
                }
                else if (!mother_iris.equals(father_iris))
                {
                    if(gender == 'M')
                    {
                        iris= mother_iris;
                    }
                    else
                        iris = father_iris;
                }
         
                System.out.println("Iris Color :" +iris);
        
         }
        
	
}
