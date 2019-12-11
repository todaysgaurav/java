import java.util.*;
class PhoneBookEntry 
 {
    private String name;
    private String phoneNumber;
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
}
class PhoneBook
 {
  public static void main(String[] args)
   {
    ArrayList<PhoneBookEntry> list = new ArrayList<PhoneBookEntry>();
    PhoneBookEntry object1 = new PhoneBookEntry();
    object1.setName("Ankit");
    object1.setPhoneNumber("9455155469");
    list.add(object1);
    PhoneBookEntry object2 = new PhoneBookEntry();
    object2.setName("Swati");
    object2.setPhoneNumber("8009423756");
    list.add(object2);
    PhoneBookEntry object3 = new PhoneBookEntry();
    object3.setName("Karuna");
    object3.setPhoneNumber("8858352452");
    list.add(object3);
    PhoneBookEntry object4 = new PhoneBookEntry();
    object4.setName("Rahul");
    object4.setPhoneNumber("8420505049");
    list.add(object4);
    PhoneBookEntry object5 = new PhoneBookEntry();
    object5.setName("Krati");
    object5.setPhoneNumber("9140552958");
    list.add(object5);
     for (PhoneBookEntry object : list)
	    {
	        System.out.println("Name : "+object.getName()+" Number : "+object.getPhoneNumber());
	    }
   }
 }

