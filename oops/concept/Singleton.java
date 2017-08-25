package oops.concept;

public class Singleton
{
    public static void main(String args[])
    {
    	//SingletonClass s = new SingletonClass();
//    	SingletonClass sc = SingletonClass.getInstanceUsingDoubleLocking();
//    	SingletonClass sc1 = SingletonClass.getInstanceUsingDoubleLocking();
//    	if(sc.equals(sc1));
//    	System.out.println("Same");
    	
    	SingletonClass st = SingletonClass.getInstance();
    	System.out.println(st.str);
    	
    	String str =new String("ABC");
    	str= str + "CDE";
    	System.out.println(str);
    	 
    	
    	String str1 ="ABC";
    	str1.toLowerCase();
    	System.out.println(str1);
    }
}

class SingletonClass {
	
	static String str= "xyz";

    private static SingletonClass instance;
    
    private SingletonClass(){
    	//System.out.println("Singleton constructor called");
    	
    }
    public static SingletonClass getInstance()
    {
    	instance = new SingletonClass();
    	return instance;
    	
    }
    
    
    
    /*public static SingletonClass getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (SingletonClass.class) {
                if(instance == null){
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }*/
    
}


    
