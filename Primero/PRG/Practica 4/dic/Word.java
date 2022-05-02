package dic;

public class Word {
    private  String spanish;
    private String english;

    public Word(String spanish, String english) {
        this.spanish = spanish;
        this.english = english;
    }

    public  String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Español= " + spanish + ", English= " + english;
    }

    public int compareWords(Word other){
        return this.getSpanish().compareToIgnoreCase(other.spanish);
    }
}
