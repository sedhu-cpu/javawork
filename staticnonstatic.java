public class staticnonstatic {
    static void myStaticMethod(){
        System.out.println("Static Methods can be called without creating objects");
    }

        public void myPublicMethod() {
            System.out.println("Public Methods must be called by creating objects");
        }

        public static void main(String[] args) {
            myStaticMethod();
            staticnonstatic myObj = new staticnonstatic();
            myObj.myPublicMethod();
        }      
}
