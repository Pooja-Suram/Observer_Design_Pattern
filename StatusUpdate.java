import java.util.ArrayList;

public class StatusUpdate implements Subject {

    private ArrayList<Observer> observers;
    
    public StatusUpdate(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver(Observer o) {
        o.update();
        
    }

    public void updateStatus(Observer o){
        int i = observers.indexOf(o);
        for(Observer observer: observers){
            if(i!= observers.indexOf(observer)){
                notifyObserver(observer);
            }
        }
    }
    
}
