public class TestDogs
{
    public static void main(String[] args)
    {
      DogTriathalonParticipant dog1 = new DogTriathalonParticipant("Bowser", 2, 85, 89, 0);
      dog1.display();
      
      DogTriathalonParticipant dog2 = new DogTriathalonParticipant("Rush", 3, 78, 72, 80);
      dog2.display();
      
      DogTriathalonParticipant dog3 = new DogTriathalonParticipant("Ginger", 3, 90,86, 72);
      dog3.display();
    }      
}