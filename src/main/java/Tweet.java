import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tweet {

    private final String author;
    private final String message;
    private final String createdDate;
    private int likeCount = 0;

    public Tweet(String author, String message) {
        this.author = author;
        this.message = message;
        this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss"));
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void like(){
        likeCount++;
        System.out.println("You liked this.");
        System.out.println("Likes: " + getLikeCount());
    }

    public void dislike(){
        likeCount--;
        System.out.println("You disliked this.");
        System.out.println("Likes: " + getLikeCount());
    }
}
