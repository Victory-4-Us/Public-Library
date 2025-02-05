//Book class (child class)
//extends off of media.java and handles the creation and display of books
public class Book extends media {
    private int pages;

    //assigns data to a book
    public void setBook(String title, String artist, int pages) {
        setItem(title, artist);
        this.pages = pages;
    }

    //prints a display specifically for books
    @Override
    void displayInfo() {
        System.out.println("Book: " + title + " by " + artist + ". pages: " + pages);
        if(isCheckedOut) {
            System.out.println("CHECKED OUT");
        } else {
            System.out.println("NOT CHECKED OUT");
        }
        System.out.println();
    }
}
