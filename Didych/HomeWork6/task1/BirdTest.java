package softserve.homework6.task1;

// Anastasiya Didych

public class BirdTest {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("eagle", "brown", 2);
        Chicken chicken = new Chicken("chicken", "light brown", 5);
        Swallow swallow = new Swallow("swallow", "black and white", 6);
        Penguin penguin = new Penguin("penguin", "black and white", 1);
        Bird birds[] = {eagle, chicken, swallow, penguin};
        for (int i = 0; i < birds.length; i++){
            System.out.println(birds[i].toString());
        }
    }
}
