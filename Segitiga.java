public class Segitiga {
    public void sudutSegitiga(int sudutA){
        System.out.println("Sudut A: " + (180 - sudutA));
    }

    public void sudutSegitiga(int sudutA, int sudutB){
        System.out.println("Sudut B: " + (180 - (sudutA + sudutB)));
    }

    public void kellSegitiga(int sisiA, int sisiB, int sisiC){
        System.out.println("Keliling A: " + (sisiA + sisiB + sisiC));
    }

    public void kellSegitiga(double sisiA, double sisiB, double sisiC){
        System.out.println("Keliling B: " + (sisiA + sisiB + sisiC));
    }
}
