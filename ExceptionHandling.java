
//exception handling

//divide by zero exception

class ExceptionHandling{
 

    public static void main(String args[]){
           int a=20, b=0, c=20, d=2;

           try{

                  System.out.println(a+" divide by "+b+"= "+a/b);

           }
           catch(Exception e){
               System.out.println(e);
           }
     

           System.out.println(c+" divide by "+d+"= "+c/d);
    }
}