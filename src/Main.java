public class Main {
    public static void main(String[] args) {

        System.out.println("La suma de los numero es: " + sumas(20,30,10));

        coche micoche = new coche();
        micoche.setPuertas(2);
        micoche.setPuertas(2);
        System.out.println("El coche tiene: " + micoche.getPuertas() + " puertas");

    }

    public static int sumas(int a, int b, int c){
        return a + b + c;
    }

    public static class coche{
        private int puertas = 0;

        public int getPuertas(){
            return puertas;
        }

        public void setPuertas(int nuevaPuerta){
            puertas += nuevaPuerta;
        }
    }
}