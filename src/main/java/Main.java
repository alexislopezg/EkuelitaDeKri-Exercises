public class Main {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();

//        lightBulb.turnOn();
//        lightBulb.turnOn();
//        lightBulb.turnOff();
//        lightBulb.turnOff();
//        lightBulb.turnOff();

//        var tweet = new Tweet("Me", "This is a test tweet");
//        System.out.println(tweet.getMessage());
//        System.out.println(tweet.getAuthor());
//        System.out.println(tweet.getCreatedDate());
//
//        tweet.like();
//
//        tweet.dislike();
//        tweet.dislike();
//        tweet.dislike();
//
//        System.out.println("Total like count is: " + tweet.getLikeCount());

        var stackingToy = new StackingToy();
        stackingToy.addRing("Blue");
        stackingToy.addRing("Yellow");
        stackingToy.addRing("Red");

        stackingToy.removeRing();
        stackingToy.removeRing();
        stackingToy.removeRing();
        stackingToy.removeRing();

    }
}
