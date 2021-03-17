public class FollowerJohn implements Observer {

    private Subject statusUpdate;

    public FollowerJohn(Subject statusUpdate){
        this.statusUpdate = statusUpdate;
        statusUpdate.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Notification to John: A person you are following updated new status!");
        
    }
}
