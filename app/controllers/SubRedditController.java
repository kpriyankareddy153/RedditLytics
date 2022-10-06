package controllers;

import models.SubReddit;
import play.mvc.*;

import views.html.*;

import views.html.Subreddits.*;

import views.html.index;

import java.net.*;
import java.net.http.*;
import org.json.*;
import org.json.JSONArray;

import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to fetch the subreddits based on keywords
 */
public class SubRedditController extends Controller{

    /**
     * An action that renders an HTML page with a list of subreddits when searched by a keyword.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/subreddit_keyword</code>.
     */
    public Result getSubReddits(String subreddit_name) {

        // API call to get the data from reddit
//        HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
//                .header("x-rapidapi-host", x_rapidapi_host)
//                .header("x-rapidapi-key", x_rapidapi_key)
//                .asJson();
//        System.out.println(response.getStatus());
//        System.out.println(response.getHeaders().get("Content-Type"));

//        // Host, charset and headers vars should be the same
//        String i = "tt0110912";
//        // Format query for preventing encoding problems
//        query = String.format("i=%s",
//                URLEncoder.encode(i, charset));
//        // Json response
//        HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
//                .header("x-rapidapi-host", x_rapidapi_host)
//                .header("x-rapidapi-key", x_rapidapi_key)
//                .asJson();
//        //Prettifying
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(response.getBody().toString());
//        String prettyJsonString = gson.toJson(je);
//        System.out.println(prettyJsonString);

        Set<SubReddit> subreddits = null;
        String link = "https://api.pushshift.io/reddit/search/submission?q=" + URLEncoder.encode(query, StandardCharsets.UTF_8);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).build();
            String response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .join();

            System.out.println(response);

            subreddits = new JSONObject(response).getJSONArray("data");;

//            subreddits = parse(response);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        return ok(Main.render(submissions));
//
//
//        Set<SubReddit> subreddits = SubReddit.getSampleData();


        return ok(subreddit.render(subreddits));
//        return ok(views.html.index.render());
//        return ok("Hello! ");
    }

}
