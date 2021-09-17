import java.util.ArrayList;
import java.util.HashMap;

public class AddressBook {


    private ArrayList<BuddyInfo> addressbook;
    public AddressBook() {
        this.addressbook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo BuddyInfo){
        addressbook.add(BuddyInfo);
    }

    public boolean removeBuddy(BuddyInfo BuddyInfo){
        for (BuddyInfo buddy : this.addressbook) {
            if (buddy.getName().equals(BuddyInfo.getName()) && buddy.getAddress().equals(BuddyInfo.getAddress()) && buddy.getPhone().equals(BuddyInfo.getPhone())){
                addressbook.remove(BuddyInfo);
                return true;
            }
        }
       return false;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
