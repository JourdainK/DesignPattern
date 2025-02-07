package IteratorPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");
        var belgium = new Country("Belgium");
        var netherlands = new Country("Netherlands");
        var italy = new Country("Italy");

        var countries = new Countries(india,poland,nigeria,canada,argentina,belgium,netherlands,italy);
        var countriesIterator = countries.iterator();

        while(countriesIterator.hasNext()){
            var country = countriesIterator.next();
            System.out.println(country);
        }

    }
}
