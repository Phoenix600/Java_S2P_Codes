package collectionInJava.map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class People
{
    private String name;
    private String country;
    private String state;
    private String city;

    public People(String name, String country, String state, String city) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Example10 {
    public static void main(String[] args) {
        People person1 = new People("John", "USA", "California", "Los Angeles");
        People person2 = new People("Alice", "UK", "England", "London");
        People person3 = new People("Michael", "Canada", "Ontario", "Toronto");
        People person4 = new People("Emma", "Australia", "New South Wales", "Sydney");
        People person5 = new People("Mohammed", "UAE", "Dubai", "Dubai");
        People person6 = new People("Sophia", "Germany", "Bavaria", "Munich");
        People person7 = new People("Juan", "Mexico", "Mexico City", "Mexico City");
        People person8 = new People("Maria", "Brazil", "São Paulo", "São Paulo");
        People person9 = new People("Chen", "China", "Beijing", "Beijing");
        People person10 = new People("Yuki", "Japan", "Tokyo", "Tokyo");
        People person11 = new People("David", "USA", "California", "San Francisco");
        People person12 = new People("Emma", "Australia", "New South Wales", "Sydney");
        People person13 = new People("Li", "China", "Beijing", "Beijing");
        People person14 = new People("Jack", "USA", "California", "Los Angeles");
        People person15 = new People("Sophie", "Canada", "Ontario", "Toronto");
        People person16 = new People("Paul", "UK", "England", "London");
        People person17 = new People("Jorge", "Mexico", "Mexico City", "Mexico City");
        People person18 = new People("Maria", "Brazil", "São Paulo", "São Paulo");
        People person19 = new People("Luis", "Mexico", "Mexico City", "Mexico City");
        People person20 = new People("Yuki", "Japan", "Tokyo", "Tokyo");

        List<People> people = new ArrayList<>(List.of(person1,person2,person3,person4,person5,person6,person7,person8,person9,person10,person11,person12,person13,person14,person15,person16,person17,person18,person19,person20));
        System.out.println("");
        Map<String,List<People>> map = people.stream().collect(Collectors.groupingBy(People::getCity));
        System.out.println(map);

    }
}
