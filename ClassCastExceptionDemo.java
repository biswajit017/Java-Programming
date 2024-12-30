

public class ClassCastExceptionDemo {
    public static void main(String[] args)
    {
        handleClassCastException();
        
    }
    public static void handleClassCastException()
    {
        Object []obj = {"kunu",123,"Hyd","BBSR"} ;
        
        for(Object object : obj)
        {

            try{
                String str = (String)object;
                System.out.println("Class Cast Sucessfull : " + str);
            }

            catch(ClassCastException e)
            {
                System.out.println("ClassCastException Caught.: Can't Convert " + object.getClass().getName() + " to String..");
                System.out.println("------------------------------------------");
                e.printStackTrace();
            }
        }

        
    }
}
