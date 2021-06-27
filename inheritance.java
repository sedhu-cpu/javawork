import javax.swing.tree.VariableHeightLayoutCache;

class inheritance {
    protected String company = "Honda";
    public void steer(){
        System.out.println("Tuut, Tuut!");
    }
}

class bike extends inheritance{
    private String model = "idk";
    public static void main(String[] args) {
        bike myObj = new bike();

        myObj.steer();

        System.out.println(myObj.company + " " + myObj.model );
    }
}
