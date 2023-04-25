public class SingletonPackage {
    private static SingletonPackage Package;

    //includes travel to and from a place (from a list of existing PLaces)
    //CREATE a list of exisiting places
    //Price
    //Hours of travels

    //private constructor.
    private SingletonPackage(){

        //Prevent form the reflection api.
        if (Package != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    //Design a singleton to load all packages into a singleton when your
    //application starts. The agent will use this singleton when choosing the
    //packages to add to a Trip

    public static SingletonPackage getInstance(){
        if (Package == null){ //if there is no instance available... create new one
            Package = new SingletonPackage();
        }

        return Package;
    }
}
