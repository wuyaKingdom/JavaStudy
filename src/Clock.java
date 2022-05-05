public class Clock {
    private Display hour=new Display(24);
    private Display minute=new Display(60);
    public void start() {
        while(true) {
            minute.increase();
            if(minute.getvalue()==0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n",hour.getvalue(),minute.getvalue());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Clock shizhong=new Clock();
        shizhong.start();
    }

}