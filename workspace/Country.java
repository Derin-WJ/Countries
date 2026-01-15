public class Country
{
  // add private instance variables for the name, capital, language, and image file.
private name;
private capital;
private language; 
private imagefile;
  // add constructors
  public Country(String n, String c, String lang, String img){
    name = n;
    capital = c;
    language = lang;
    imageFile = img;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLanguage(){
    return language;
  }
  public String getImg(){
    return imageFile;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 


  
}