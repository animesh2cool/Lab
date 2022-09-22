/* 3.Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, 
movieEndTime, MovieTicketPrice as instance variables. */

public class Movie {
    String movieName;
    String movieStartTime;
    String movieEndTime;
    String movieTicketPrice;

    String getMovie() {
        return ("\n movieName : "+ movieName + "\n movieStartTime : "+ movieStartTime + "\n movieEndTime : "+movieEndTime + "\n movieTicketPrice : "+movieTicketPrice);
    }
    void setMovie ( String movieName, String movieStartTime, String movieEndTime, String movieTicketPrice ) {
        this.movieName= movieName;
        this.movieStartTime= movieStartTime;
        this.movieEndTime= movieEndTime;
        this.movieTicketPrice= movieTicketPrice;
    }

    public static void main(String args[]) {
        Movie m = new Movie();
        m.setMovie("Java Thrill", "02:00 PM", "04.30 PM", "275");
        System.out.println(m.getMovie());
    }
}
