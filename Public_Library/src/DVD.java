//DVD class (child class)
//extends off of media.java and handles the creation and display of dvd's
public class DVD extends media {
    private int length;

    //assigns data to a dvd
    public void setDVD(String title, String artist, int length) {
        setItem(title, artist);
        this.length = length;
    }

    //prints a display specifically for dvd's
    @Override
    void displayInfo() {
        System.out.println("DVD: " + title + " by " + artist + ". Duration(Min): " + length);
        if(isCheckedOut) {
            System.out.println("CHECKED OUT");
        } else {
            System.out.println("NOT CHECKED OUT");
        }
        System.out.println();
    }
}
