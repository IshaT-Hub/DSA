public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();              // Created a pen object called p1
        p1.setColor("Blue");            // set color
        System.out.println(p1.getColor());   // print color
        p1.setTip(5);                        // set tip
        System.out.println(p1.getTip());     // print tip
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        Student s1 = new Student("Isha Tiwari G>O>A>T");
        System.out.println(s1.name);

        //  BankAccount bA1 = new BankAccount();
        //  bA1.Username = "IshaTiwari";
        //  //bA1.password = "abcdefg";    not accecible as we are trying to access it outside the class 
        //  bA1.setPw("abcdefg");
    }
}

// class BankAccount{
//     public String Username;
//     private String password;

//     public void setPw(String newPw){
//         password = newPw;       // here it is accessable as within the function and within the class we are trying to access the private pw.
//     }
// }

class Pen {                              // Pen Blueprint    
    // properties + functions
    String color ;                       //properties
    int tip ; 

    //getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;                     
    }

    //setters
    void setColor(String color){      //func
        this.color  = color ;
    }

    void setTip(int tip){
        this.tip  = tip ;
    }

}

class Student{
    String name;
    int rollNo;
    
    //PARAMETERIZED CONSTRUCTOR  
    Student(String name){    
        this.name = name;
    }
}