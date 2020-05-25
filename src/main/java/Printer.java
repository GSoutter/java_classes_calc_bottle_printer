public class Printer {

    private int paper;
    private int toner;


    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }


    public boolean enoughPaper(int sheets){
        return this.paper >= sheets;
    }
    public boolean enoughToner(int sheets){
        return this.toner >= sheets;
    }

    public boolean print(int numPages, int numCopies){
    int sheets = numPages * numCopies;

    if (enoughPaper(sheets) && enoughToner(sheets)){
        this.paper -= sheets;
        this.toner -= sheets;
        return true;
    }
    return false;

    }

    //Getters and setters

    public int getPaper(){
        return this.paper;
    }
    public int getToner(){
        return this.toner;
    }

}
