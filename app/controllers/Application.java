package controllers;

import models.*;
import play.mvc.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index(String email, String password) {
        System.out.println(password);
    	render();
    }
    
    public static void me() {
        render();
    }

}