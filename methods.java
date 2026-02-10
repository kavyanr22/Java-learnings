class Example1 {
    void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.hello();
    }
    }

    class Example2 {
    void hello() {
        System.out.println("Hello");
    }
    void add(int a,int b) {
        System.out.println(a + b);
    }
    
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.add(26,22);
    }
    }

    class Example3 {
        int getNumber() {
            return 10;
        }

        public static void main(String[] args) {
          Example3 obj = new Example3();
          int result = obj.getNumber();
          System.out.println(result);
    }
    }

    class Example4 {
        static void staticMethod() {
            System.out.println("I am static");
        }
        void instanceMethod(){
           System.out.println("I am instance"); 
        }

        public static void main(String[] args){
        staticMethod();
        Example4 obj = new Example4();
        obj.instanceMethod();
    }
    
}

class Example5 {
    void greet(String name) {
        System.out.println("Hello " +name);
    }

    public static void main(String[] args) {
         Scanner scn = newScanner(System.in);
         System.out.print("enter name: ");
         String name = scn.nextLine();

         Example5 obj = new Example5();
         obj.greet(name);
}

}


