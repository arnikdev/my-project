class Hello{

    public void greetings(String msg)
    {
        System.out.println("Bye Bye" + msg);
    }
    public void sum(int n1,int n2)
    {
        System.out.println("Total Sum " + (n1 + n2));
    }
    public static void main(String[] args)
    {
        System.out.println("Hello Wolrd");
        Hello obj = new Hello();
        obj.greetings("Git Lab");
    }
}