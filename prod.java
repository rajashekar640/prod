class Prod{
public static void main(String[] args) {
        
    
    String n= "morning";
    String b= "" ;

    b =switch(n)
    {
        case "abc","done" -> "monday";
        case "bro"->    "tuesday";
        case "effef"->    "thursday";
        default->    "sunday";


    };

    System.out.println(b);


    }
}