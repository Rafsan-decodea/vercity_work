import java.util.*;
import java.util.ArrayList;
abstract class  Book{
    
protected   ArrayList Book_id  = new ArrayList();
            ArrayList  title  = new ArrayList();
            ArrayList  author = new ArrayList();
      public ArrayList price  = new ArrayList();
      ArrayList arry = new ArrayList();

   void setid(int count)
   {

        Book_id.add(count);
   }
   void  getId()
   {
       String show_id;
       for (int i=0; i<Book_id.size();i++){
           show_id = String.format("[+]Your Book Price is ===>%d\n",Book_id.get(i));
           System.out.print(show_id);
       }

       
 

   }

   void  Price(int prices)
   {
      price.add(prices);
       
   }

 void  show_price()
   {
   
       for (int i=0 ; i<=price.size()-1; i++)
       {
        String show_price = String.format("[+]Your Book Price is ===>%d\n",price.get(i));
        System.out.print(show_price);
       }
     
   }


   
}