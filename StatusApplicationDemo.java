public class StatusApplicationDemo {
    
    public static void main(String[] args) {
       
        StatusUpdate update = new StatusUpdate();
        FollowerAmy amy = new FollowerAmy(update);
        FollowerPooja pooja = new FollowerPooja(update);
        FollowerJohn john = new FollowerJohn(update);

        update.updateStatus(pooja);

    }

}
