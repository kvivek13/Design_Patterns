class Test
{
  private static Test t = null;
  
  private Test()
  {
  }
  
  public static Test getTest()
  {
    if(t == null)
      t = new Test();
    
    return t;
  }
}

class Main
{
  public static void main(String[] args)
  {
    Test t1 = Test.getTest();
    Test t2 = Test.getTest();
    
  }
}  
