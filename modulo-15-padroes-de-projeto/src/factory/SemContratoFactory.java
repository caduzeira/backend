package factory;

public class SemContratoFactory extends Factory{

    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new BrasiliaCar(100, "", "preto");
        }else{
            return null;
        }
    }
    
}
