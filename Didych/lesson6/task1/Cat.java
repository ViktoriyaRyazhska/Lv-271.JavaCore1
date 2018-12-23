package softserve.lesson6;

// Anastasiya Didych

class Cat extends Animal {

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
    public Cat(String voice, String feed){
        this.voice = voice;
        this.feed = feed;
    }

}




