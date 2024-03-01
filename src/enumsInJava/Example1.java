package enumsInJava;

enum Color {
    RED("My Name is Red"){
        @Override
        public void family(){
            this.name = "reeeeeed";
            System.out.println("I'm Red From sRGB");
        }
    },
    GREEN{
        @Override
        void family() {
            System.out.println("I'm Green From sRGB");

        }
        void family(String name){}
    },
    BLUE{
        @Override
        public void family(){
            System.out.println("I'm Blue From sRGB");

        }
    };

    String name;
    Color(){
        System.out.println("Default Constructor Called");
    }
    Color(String name){
        System.out.println(name);
    }
    abstract void family();
}

public class Example1 {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1.name);
        c1.family();
    }
}
