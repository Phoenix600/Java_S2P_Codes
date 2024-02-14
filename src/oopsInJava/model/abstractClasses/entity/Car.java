package oopsInJava.model.abstractClasses.entity;


public abstract class Car {
    String engineType;
    public abstract void startEngine();
    public void getType(){
        System.out.println("This is car");
    }
    public void setEngineType(String type){
//        System.out.println("Engine Type : " + type);
        this.engineType = type;
    }

    public String getEngineType(){
        return this.engineType;
    }

    @Override
    public String toString(){
        return this.engineType + "....";
    }

}
