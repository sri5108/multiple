interface Printable{  
void print();  
}  
  
interface Showable{  
void show();  
}  
  
class Sri implements Printable,Showable{  
  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Sri obj = new Sri();  
obj.print();  
obj.show();  
 }  
}  