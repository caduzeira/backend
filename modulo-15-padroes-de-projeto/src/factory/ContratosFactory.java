package factory;

public class ContratosFactory extends Factory {

    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorolaCar(100, "", "preto");
        }else{
            return null;
        }
    }

    
}
