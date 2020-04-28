class Hello{

    public void greetings(String msg)
    {
        System.out.println("Hello " + msg);
    }
    public static void main(String[] args)
    {
        System.out.println("Hello Wolrd");
        Hello obj = new Hello();
        obj.greetings("Git");
    }
}