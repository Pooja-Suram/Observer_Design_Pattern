public class FollowerAmy implements Observer{
    
    private Subject statusUpdate;

    public FollowerAmy(Subject statusUpdate){
        this.statusUpdate = statusUpdate;
        statusUpdate.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Notification to Amy: A person you are following has updated new status!");
        
    }


}
