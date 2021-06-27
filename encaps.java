public class encaps {
    private String name;

    public String getName(){ //public method
        return name;
    }

    public void setName(String newName){ //
        this.name = newName;
    }
    public class Main{
        public static void name(String[] args) {
            Person myObj = new Person();
            myObj.name = "John";
            System.out.println(MyObj.name);
        }
    }
}
