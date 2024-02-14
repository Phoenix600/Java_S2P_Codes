package oopsInJava.model.abstractClasses.entity;

public interface MusicPlayer {
    String play();
    public abstract void pause();
    String next();
    String previous();

    default void musicPlayerVersion(){
        System.out.println("12.12.0.12");
    }
}
