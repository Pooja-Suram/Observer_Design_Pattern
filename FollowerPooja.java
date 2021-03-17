public class FollowerPooja implements Observer{

    private Subject statusUpdate;

    public FollowerPooja(Subject statusUpdate){
        this.statusUpdate = statusUpdate;
        statusUpdate.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Notification to Pooja: A person you are following updated new status!");
        
    }
    
}
