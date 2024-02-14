package oopsInJava.model.abstractClasses.entity;

public class Mobile implements Camera,MusicPlayer{
    public String play(){
        return "Aaradhya...Song is playing";
    }
    public void pause(){
        System.out.println("Badshah Song is Paused");
    }


    @Override
    public String next(){
        return "Playing Chand Tare";
    }

    @Override
    public String previous(){
        return "Playing previous Chaiya Chaiya..";
    }

    @Override
    public void clickPicture() {
        System.out.println("Clicking Picture");
    }

    @Override
    public String recordVideo(){
      return "Recording started...";
    }
}
