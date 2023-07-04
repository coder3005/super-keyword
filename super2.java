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
    B() /* in case of default constructor it is not necessary to write super */
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
