public class Training1 {
    static public void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setMyField(13);
        System.out.println(myClass.getMyField());
       System.out.println("Hello wolrld"); 
    }
}
class MyClass {
    
    private int myField; // Private field
    private int a (){
      return myField ++;    
    }

    // Getter for myField
    public int getMyField() {
        return myField;
    }

    // Setter for myField
    public void setMyField(int value) {
        this.myField = value;
    }
}
