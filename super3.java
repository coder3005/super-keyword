/*Super keyword*/
class A 
{
    A(int a)
    {
        System.out.println("Hello Viewer "+a);
    }
}
class B extends A
{
    B() /* in case of parameterized constructor it is necessary to write super */
    {
       super(100);
       System.out.println("Hello Learner");
    }
}
class test
{
    public static void main(String[] args) {
        B r=new B();
    }
}
