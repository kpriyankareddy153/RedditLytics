package models;

import java.util.*;

public class SubReddit {

    public String reddit_body;
    public String link_id;
    public String reddit_id;
    public String subreddit_id;
    public String subreddit_name;
    public String permalink;

    public SubReddit(String reddit_body, String link_id, String reddit_id, String subreddit_id, String subreddit_name, String permalink) {
        this.reddit_body = reddit_body;
        this.link_id = link_id;
        this.reddit_id = reddit_id;
        this.subreddit_id = subreddit_id;
        this.subreddit_name = subreddit_name;
        this.permalink = permalink;
    }

    private static Set<SubReddit> subreddits;

    static {
        subreddits = new HashSet<>();
        subreddits.add(new SubReddit(
                "this is about water", "link_water", "red_water", "sub_water",
                "sub_name _water", "https://en.wikipedia.org/wiki/Water#:~:text=Water%20(chemical%20formula%20H2,it%20acts%20as%20a%20solvent).&text=The%20gaseous%20state%20of%20water%20is%20steam%20or%20water%20vapor."
        ));
        subreddits.add(new SubReddit(
                "this is about fruits", "link_fruits", "red_fruits", "sub_fruits",
                "sub_name_fruits", "https://en.wikipedia.org/wiki/Fruit"
        ));
        subreddits.add(new SubReddit(
                "this is about vegetables", "link_vegetables", "red_vege", "sub_vege",
                "sub_name_vege", "https://www.vegetables.co.nz/vegetables-a-z/"
        ));
    }

    public static Set<SubReddit> getSampleData() {
        return subreddits;
    }

}
