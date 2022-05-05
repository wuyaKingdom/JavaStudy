public class Display {
    private int value=0;
    private int limate=0;
    public void increase() {
        value++;
        if(value==limate) {
            value=0;
        }
    }
    public int getvalue() {
        return value;
    }
    Display(int limate){
        this.limate=limate;
    }

}