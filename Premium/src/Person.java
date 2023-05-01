public class Person {
//Create a static instance of a Person object
        private static Person persons;


        //CREATE people variables
    private String person1 = "Jan Akers";
    private String person2 = "Hannah Amis";
    private String person3 = "Brion Hibbett";
    private String person4 = "Ryker Vomykca";
    private String person5 = "Charles Ren";
    private String person6 = "Rolland ";
    private String person7= "Teale Barker";
    private String person8 = "Juilie Adkins";
    private String person9 = "Steve Kinney";
    private String person10 = "Baldric Reil";

    //private constructor.
        private Person(){

            //Prevent form the reflection api.
            if (persons != null){
                throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
            }
        }


        public static Person getInstance(){
            //if there is no instance available... create new one
            if (persons == null){
                persons = new Person();
            }

            return persons;
        }

        public String getPerson1(){
            return person1;
        }
    public void setPerson1(String person1) {
        this.person1 = person1;
    }

    public String getPerson2(){
        return person2;
    }
    public void setPerson2(String person2) {
        this.person2 = person2;
    }

    public String getPerson3(){
        return person3;
    }
    public void setPerson3(String person3) {
        this.person3 = person3;
    }

    public String getPerson4(){
        return person4;
    }
    public void setPerson4(String person4) {
        this.person4 = person4;
    }
    public String getPerson5(){
        return person5;
    }
    public void setPerson5(String person5) {
        this.person5 = person5;
    }
    public String getPerson6(){
        return person6;
    }
    public void setPerson6(String person6) {
        this.person6 = person6;
    }

    public String getPerson7(){
        return person7;
    }
    public void setPerson7(String person7) {
        this.person7 = person7;
    }

    public String getPerson8(){
        return person8;
    }
    public void setPerson8(String person8) {
        this.person8 = person8;
    }

    public String getPerson9(){
        return person9;
    }
    public void setPerson9(String person9) {
        this.person9 = person9;
    }

    public String getPerson10(){
        return person5;
    }
    public void setPerson10(String person10) {
        this.person10 = person10;
    }

    public static void setPerson(Person persons){
            Person.persons = persons;
    }

    }


