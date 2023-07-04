/*Super keyword*/
class A 
{
    A()
    {
        System.out.println("Hello Viewer");
    }
}
class B extends A
{
    B()
    {
       super(); /* if we do not write super then it will automatically taken as super */
       System.out.println("Hello Learner");
    }
}
class test
{
    public static void main(String[] args) {
        B r=new B();
    }
}
