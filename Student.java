public class Student {
    public String firstName;
    public String animal;
    public Student(String name, String favFood)
    {
      firstName = name;
      food = favFood;
    }
    public String getName()
    {
      return firstName;
    }
    public String favFood()
    {
      return animal;
    }
    public String toString()
    {
      return firstName + "'s favourite food is " + favFood;
}
