package softserve.lesson6;

// Anastasiya Didych

public class Dog extends Animal {

    private String feed;
    private String voice;

    @Override
    public String voice() {
        return voice;
    }

    @Override
    public String feed() {
        return feed;
    }
    public Dog(String voice, String feed){
        this.voice = voice;
        this.feed = feed;
    }


}