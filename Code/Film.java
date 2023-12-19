class Film implements Comparable<Film> {
    String imbd_title_id,title,original_title,date_published,genre,country,language,director,writer,production_company,actors,description,usa_gross_income,worlwide_gross_income,budget;
    int year,duration,votes;
    Float avg_vote,reviews_from_users,reviews_from_critics,metascore;

    Film(String imbd_title_id,String title,String original_title,int year, String date_published, String genre,int duration, String country, String language, String director, String writer,String production_company, String actors, String description,Float avg_vote,int votes,String budget, String usa_gross_income,String worlwide_gross_income,Float metascore, Float reviews_from_users, Float reviews_from_critics) {
        this.imbd_title_id = imbd_title_id; 
        this.title = title;  
        this.original_title = original_title; 
        this.date_published = date_published; 
        this.genre = genre; 
        this.country = country; 
        this.language = language; 
        this.director = director; 
        this.writer = writer; 
        this.production_company = production_company; 
        this.actors = actors; 
        this.usa_gross_income = usa_gross_income;  
        this.worlwide_gross_income = worlwide_gross_income;
        this.year = year; 
        this.duration = duration; 
        this.avg_vote = avg_vote; 
        this.votes = votes; 
        this.budget = budget; 
        this.metascore = metascore; 
        this.reviews_from_users = reviews_from_users;
        this.reviews_from_critics = reviews_from_critics; 


    }



    @Override
    public int compareTo(Film autre) {
        return this.title.compareTo(autre.title);
    }
}