//media data class (parent class)
//holds data on library materials
//allows the assigning and display of the checked out status
abstract class media {

    protected String title;
    protected String artist;

    protected boolean isCheckedOut;

    //sets the data of an item
    public void setItem(String title, String artist) {
        this.title = title;
        this.artist = artist;
        isCheckedOut = false;
    }

    //abstract method depending on the type of media
    abstract void displayInfo();

    //sets the checked out status to true
    //returns a variable to assist in updated the user info of items checked out
    public int checkoutItem() {
        if(!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been successfully checked out.");
            System.out.println();
            return 1;
        } else {
            System.out.println(title + " has already been checked out");
            System.out.println();
            return 0;
        }
    }

    //sets the checked out status to false
    //returns a variable to assist in updated the user info of items checked out
    public int returnItem() {
        if(isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
            System.out.println();
            return -1;
        } else {
            System.out.println(title + " has not been checked out yet");
            System.out.println();
            return 0;
        }   
    }

    //returns the title of an item
    public String getTitle() {  
        return title;
    }

    //returns the artist/author of an item
    public String getArtist() {
        return artist;
    }

    //returns the checked out status of an item
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}
