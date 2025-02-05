//user data class (parent class)
//holds instance data on the user
//allows the updating of the info (getters/setters)
abstract class user {

    protected String name;;
    protected String ageType;
    
    protected int age;
    protected int acctNum;
    protected int itemsOut;

    //sets and stores the data for a user
    //calls upon the setAgeType method to determine what catagory they are in
    public void setUser(String name, int age, int acctNum) {
        this.name = name;
        this.age = age;
        this.acctNum = acctNum;
        itemsOut = 0;
        setAgeType();
    }

    //allows other member classes (teen, youth, adult...) to be made and customized
    abstract void displayInfo();

    //a private method for determining age type
    //(could be used to limit certain library materials to younger users)
    private void setAgeType() {
        if(age > 0 && age < 13) {
            ageType = "youth";
        } else if(age >= 13 && age < 18) {
            ageType = "teen";
        } else if(age >= 18) {
            ageType = "adult";
        } else {
            ageType = "ERROR: age doesn't match any age types";
            System.out.println("ERROR: age doesn't match any age types.");
        }
    }

    //updates current itemsOut count
    public void setItemsOut(int x) {
        itemsOut = itemsOut + x;
    }

    //returns the account number
    public int getAcctNum() {
        return acctNum;
    }

    //returns the name
    public String getName() {
        return name;
    }

    //returns the age
    public int getAge() {
        return age;
    }

    //returns the number of items checked out
    public int getItemsOut() {
        return itemsOut;
    }

    //updates the name and displays to the user
    public void updateName(String name) {
        this.name = name;
        System.out.println();
        System.out.println("User's name has been updated to " + name);
    }

    //updates the age and displays both the age and age type to the user
    public void updateAge(int age) {
        this.age = age;
        System.out.println();
        System.out.println("User's age has been updated to " + age);
        setAgeType();
        System.out.println("User's age type has been assigned to " + ageType);
    }

    //updates the account number and displays it to the user
    public void updateAcctNum(int acctNum) {
        this.acctNum = acctNum;
        System.out.println();
        System.out.println("User's account number has been updated to " + acctNum);
    }
}

