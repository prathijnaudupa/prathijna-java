class Buff {
 
    public static void join1(String s1)
    {
        s1 = s1 + "hello";
    }
 
    public static void join2(StringBuffer s2)
    {
        s2.append("man");
    }

    public static void main(String[] args)
    {
       
        String s1 = "hi";
 
        join1(s1);
 
        System.out.println("String: " + s1);
 
        StringBuffer s2 = new StringBuffer("hi");
 
        join2(s2);
 
        System.out.println("StringBuffer: " + s2);
    }
}