package dic;

public class Dictionary {
    private Word[] allWords;
    private int size;
    final static int MAX = 4;

    public Dictionary() {
        this.allWords = new Word[MAX];
        this.size = 0;
    }

    public int insert(Word toInsert) {
        int toret = -1;

        int i;
        if (this.size == MAX){
            System.out.println("No hay espacio");
        }else if (this.size != MAX) { 

            i = 0;


            while (i < size && toInsert.compareWords(this.allWords[i]) > 0) {
                i++;
            }

            if (i < size && toInsert.compareWords(this.allWords[i]) < 0) {
                
                for (int j = size; j > i; j--) {
                    this.allWords[j] = this.allWords[j - 1];
                }

            }
            this.allWords[i] = toInsert;
            size++;
            toret = 0;

        }

        return toret;
    }

    public int remove(Word toRemove) {
        int toret = -1;

        int i = 0;

        

        while (i < size && toRemove.compareWords(this.allWords[i]) != 0) {
            i++;
        }

        if (i < size && toRemove.compareWords(this.allWords[i]) == 0) {
            for (int j = i; j < size - 1; j++) {
                this.allWords[j] = this.allWords[j + 1];
            }
            size--;
            toret = 0;

        }

        return toret;
    }

    public void listWords() {

        for (int i = 0; i < size; i++) {
            System.out.println(allWords[i].toString());
        }
    }

   

}
