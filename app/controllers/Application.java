package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Application's Controller.
 */
public class Application extends Controller {

    /**
     * Home Page.
     * @return http response containing html result.
     */
    public Result index() {
        return ok(views.html.index.render("Your new application is ready."));
    }

}
