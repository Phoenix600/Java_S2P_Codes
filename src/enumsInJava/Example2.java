package enumsInJava;

interface GameCharacters{
    void movement();
}

class People implements GameCharacters{
    @Override
    public void movement() {

    }
}

class Police{

}
class MainPlayer{

}
enum Characters implements GameCharacters{
   PEOPLE,
    MAIN_PLAYER;

    Characters() {
    }



    @Override
    public void movement() {

    }
}

public class Example2 {
}
