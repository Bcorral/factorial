public class arrays {
    public static void main(String[] args) {

        int[] numero = {1, 71, 23, 53, 5, 6,3,5,6,-2,3};
        int contador = 0;

        while (contador >= 0) {
            System.out.println("numero:" + numero[contador++]);
            if(numero[contador]<0 ) break;
        }
        System.out.println("hemos recuperado " + contador + " numeros positivos");
    }
}