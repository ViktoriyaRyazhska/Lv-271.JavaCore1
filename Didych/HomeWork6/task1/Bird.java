package softserve.homework6.task1;

// Anastasiya Didych

abstract class Bird {
    abstract String fly();
    String feather;
    int layEggs;
    String type;

    @Override
    public String toString() {
        return "The " + type + " has " + feather + " feather, lays " + layEggs + " egg. Can the " + type + " fly? " + fly();
    }
}
