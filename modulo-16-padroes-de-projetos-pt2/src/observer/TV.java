package observer;

public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notica por TV" + subject.toString());
    }
    
}
