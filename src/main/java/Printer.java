public class Printer {

    private int paper;


    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper(){
        return this.paper;
    }

    public boolean enoughPaper(int sheets){
        return this.paper >= sheets;
    }

    public boolean print(int numPages, int numCopies){
    int sheets = numPages * numCopies;

    if (enoughPaper(sheets)){
        this.paper -= sheets;
        return true;
    }
    return false;

    }

}
