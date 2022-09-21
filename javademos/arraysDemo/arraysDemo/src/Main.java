public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------");

        String[] ogrenicler = new String[4];
        ogrenicler[0] ="Engin";
        ogrenicler[1] ="Derin";
        ogrenicler[2] ="Salih";
        ogrenicler[3] ="Ahmet";
        //ogrenicler[4] = "Ali"

        for (int i = 0; i < ogrenicler.length; i++) {
            System.out.println(ogrenicler[i]);
        }

        System.out.println("--------------------");

        for (String ogrenci:ogrenicler) {
            System.out.println(ogrenci);
        }

    }
}
