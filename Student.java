public class Student {
    public String firstName;
    public String favoriteFood;
    public Student(String name, String favoriteFood)
    {
      firstName = name;
      food = favoriteFood;
    }
    public String getName()
    {
      return firstName;
    }
    public String favoriteFood()
    {
      return food;
    }
    public String toString()
    {
      return firstName + "'s favourite food is " + favoriteFood;
}
