package hello;



public class Greeter {



  private String name = "";
  private int gradeInSWE = 96;



  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }
  
  public void setGradeInSWE(int grade)
  {
   
      this.gradeInSWE = grade;
    
  }
  
  public int getGradeInSWE()
  {
      return gradeInSWE;
  }


  public String sayHello() 

  {

  	if (name == "") 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }

}
