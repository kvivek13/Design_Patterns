class Test
{
    private static Test t = new Test();
    
    private Test()
    {
        
    }
    
    public static Test getTest()
    {
        return t;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Test t1 = Test.getTest();
        Test t2 = Test.getTest();
        System.out.println(t1 + " " + t2);
    }
}