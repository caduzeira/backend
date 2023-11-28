package generics;

public class ExemploGenericEntry {
    public static void main(String[] args) {
        GenericEntry<String,Long> entry = new GenericEntry<String,Long>("Telefone",10l);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        GenericEntry<Long,String> entryLong = new GenericEntry<Long,String>(10l,"Carlos");
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
