package data;

public class PersonellData {
  private String firstName ;
  private String lastName ;
  private String id ;

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
//        return null;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
//        return null;
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
//        return null;
        return id;
    }
    public String toString(){
        return "Personel [personel id= "+id+" Firstname= " +firstName+" lastname= "+lastName+"]";
    }
    
}
