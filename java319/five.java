package java319;

class Movie {
  String title;
  String genre;
  double rating;

  Movie(String title, String genre, double rating) {
    this.title = title;
    this.genre = genre;
    this.rating = rating;
  }

  void printdetails() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Rating: " + rating);
  }
}

class MovieFactory {
  void createMovie(String title, String genre, double rating) {
    
    if(rating > 10 || rating < 0) {
      System.out.println("Invalid Rating");
    }else {
      Movie m = new Movie(title, genre, rating);
    m.printdetails();
    }
    }
}

class MainClass {
  public static void main(String args[]) {
    MovieFactory mf = new MovieFactory();
    mf.createMovie("My show", "slice of life", 9.5);
  }
}