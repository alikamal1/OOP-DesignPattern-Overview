package Design_Pattern.Structural.Facade.Exercise;

import java.util.List;

public class TwitterAPI {
    private String appKey;
    private String secret;

    public TwitterAPI(String appKey, String secret) {
        this.setAppKey(appKey);
        this.setSecret(secret);
    }

    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());

        return tweets;
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken =  oauth.getAccessToken(requestToken);
        
        return accessToken;
    }

    public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
    
}