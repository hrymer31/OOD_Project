public class SingletonPerson {
    private static SingletonPerson Persons;

    //private constructor.
    private SingletonPerson(){

        //Prevent form the reflection api.
        if (Persons != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    //Design a singleton to load all people into a singleton when your application
    //starts. The agent will use this singleton when choosing people to add to a
    //Trip

    public static SingletonPerson getInstance(){
        if (Persons == null){ //if there is no instance available... create new one
            Persons = new SingletonPerson();
        }

        return Persons;
    }
}
