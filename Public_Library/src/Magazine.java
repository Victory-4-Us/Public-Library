//Magazine class (child class)
//extends off of media.java and handles the creation and display of magazines
public class Magazine extends media {
    private int issue;
    private int pages;

    //assigns data to a magazine
    public void setMagazine(String title, int issue, int pages) {
        setItem(title, "various artists");
        this.issue = issue;
        this.pages = pages;
    }

    //prints a display specifically for magazines
    @Override
    void displayInfo() {
        System.out.println("Magazine: " + title + ". Issue number: " + issue + " pages: " + pages);
        if(isCheckedOut) {
            System.out.println("CHECKED OUT");
        } else {
            System.out.println("NOT CHECKED OUT");
        }
        System.out.println();
    }

}
