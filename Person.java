package Child;
public class Person {
        String firstname;
	String lastName;
	String address;
	char gender;
	String iris;
	
        private Person father;
        private Person mother;
        
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
        
         public void setGender(char gender) {
                  this.gender= gender;
                }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getIris() {
        return iris;
    }

    public void setIris(String iris) {
        this.iris = iris;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }
         
         
         
         public void Color_Of_Iris()
         
         {
              if(mother.getIris().equals(father.getIris()))
                {
                   if(this.gender == 'M'){
                this.iris = "Brown";
                }
                   else if(this.gender=='F')
                   {
                       this.iris= "Not defined";
                 
                   }
                
                }
                else if (!mother.getIris().equals(father.getIris()))
                {
                    if(this.gender == 'M')
                    {
                        iris= mother.getIris();
                    }
                    else
                        iris = father.getIris();
                }
         
                System.out.println("Iris Color :" +iris);
        
         }
        
	
}
