package movies;//package movies;


import movies.Movie;
import movies.MoviesArray;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String userChoice;

        System.out.println("\nWelcome to MovieLister!\n\nWhat kind of movie you like to see?\n");


        do {
            showMenu();
            System.out.print("\nEnter your choice: ");
            userChoice = input.getString();

            if(userChoice.equals("1")) {
                showAll();
            } else if(userChoice.equals("2")) {
                showMoviesByCategory("animated");
            } else if(userChoice.equals("3")) {
                showMoviesByCategory("drama");
            } else if(userChoice.equals("4")) {
                showMoviesByCategory("horror");
            } else if (userChoice.equals("5")) {
                showMoviesByCategory("scifi");
            }
            System.out.println();

        } while(!userChoice.equals("0"));

        System.out.println("You decided to exit.\nThank you for using my Movie Application!");

    }

    public static void showMenu() {
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
    }

    public static void showMoviesByCategory(String category) {
        Movie[] allMovies = MoviesArray.findAll();

        for(Movie movie : allMovies) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void showAll() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
}
