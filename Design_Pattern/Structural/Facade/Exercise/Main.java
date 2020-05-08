package Design_Pattern.Structural.Facade.Exercise;

public class Main {
  public static void main(String[] args) {
    var tweeterAPI = new TwitterAPI("appKey", "secret");
    tweeterAPI.getRecentTweets();
  }

}
