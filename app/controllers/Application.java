package controllers;

import models.*;
import play.mvc.*;


public class Application extends Controller {

    public static void index(String email, String password) {
        System.out.println(password);
    	render();
    }
    
    public static void me() {
        render();
    }
    
    public static void register() {
        render();
    }
    
    public static void handleSubmit(){
    	System.out.println("asd");
    }

}