// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static class Basket{
    ArrayList<String> product=new ArrayList<>();
    ArrayList<Integer> unitPrice=new ArrayList<>();
    ArrayList<Integer> gst=new ArrayList<>();
    ArrayList<Integer> quantity=new ArrayList<>();
}

public static void MaxgstP(Basket B){
    String Pro=new String();
    int max=0;
    for(int i=0;i<B.product.size();i++){
        // Basket pp = B.get(i);
        int an = B.gst.get(i)*B.quantity.get(i)*B.unitPrice.get(i);
        if(an > max){
            max=an;
            Pro=B.product.get(i);
        }
    }
    System.out.println("Product with max gst"+Pro);
    System.out.println("Amount"+max);
    
}
public static void TotalAmount(Basket B){
    int ans=0;
    for(int i=0;i<B.product.size();i++){
        
        int discount=0;

        //discount
        if(B.unitPrice.get(i) >= 500){
            discount = (int)(B.unitPrice.get(i)*.05);
        }
        int gsta=(B.gst.get(i)*(B.unitPrice.get(i)/100));
        ans+=(B.quantity.get(i)*B.unitPrice.get(i)) +(B.quantity.get(i)*gsta) - discount;
       
    }
    System.out.println("Total amount - ");
    System.out.println(ans);
}

public static void main(String []args) {
    Basket p1 = new Basket();
    p1.product.add("Leather Wallet");
    p1.unitPrice.add(1100);
    p1.gst.add(18);
    p1.quantity.add(1);
    
    p1.product.add("Umbrella");
    p1.unitPrice.add(900);
    p1.gst.add(12);
    p1.quantity.add(4);
    
    p1.product.add("Umbrella");
    p1.unitPrice.add(900);
    p1.gst.add(12);
    p1.quantity.add(4);
    
    p1.product.add("Cigarette");
    p1.unitPrice.add(200);
    p1.gst.add(28);
    p1.quantity.add(3);
    
    p1.product.add("Honey");
    p1.unitPrice.add(100);
    p1.gst.add(0);
    p1.quantity.add(2);
    
    //ArrayList<Basket> B = {p1,p2,p3,p4};
    MaxgstP(p1);
    TotalAmount(p1);
}
}
