package conditionalStatements;

class Navigation{
    void run(){
        System.out.println("Running Navigation");
    }
}

class HomeNavigation extends Navigation{
    void run(){
        System.out.println("Running HomeNavigation");
    }
    void run2(){
        System.out.println("Running run 2");
    }
}

class SearchNavigation extends Navigation{
    void run(){
        System.out.println("Running Search Navigation");
    }
}

public class Example6 {
    public static void main(String[] args) {
        String choice = "home-screen";
        switch (choice){
            case "home-screen":
                    new HomeNavigation().run();
                    break;
            case "search-screen":
                new SearchNavigation().run();
                break;
            default:
                System.out.println("Invalid route");
                break;
        }
    }
}
