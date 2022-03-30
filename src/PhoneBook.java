import java.util.Formattable;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phoneBook;
    private String lastLookUp;


    public PhoneBook() {
        phoneBook = new HashMap<String, String>();
    }

    public void insert(String number, String name){
        phoneBook.put(number, name);
        System.out.println(phoneBook.get(number));
    }

    public void lookUp(String search) throws Exception{
        for (String key : phoneBook.keySet()) {
           if(phoneBook.get(key).equalsIgnoreCase(search)){
               lastLookUp = key;
               System.out.println(search + ": " + key);
               return;
           }
        }
        throw new Exception("Name can not be found");
    }

    public void delete(){
        phoneBook.remove(lastLookUp);
    }
}
