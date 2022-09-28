public class Main {

    public static void main(String[] args) {
        //fonksiyon yazarak kendimizi tekrarlamayı engellemiş oluyoruz.
        sayiBulmaca();
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacakSayi=5;
        boolean varMi=false;
        for(int sayi:sayilar){
            if(aranacakSayi==sayi){
                varMi=true;
                break;
            }
        }
        String mesaj="";
        if(varMi){
            mesaj="Sayı mevcuttur."+aranacakSayi;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayı mevcut değildir."+aranacakSayi);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println("Sayı mevcuttur.");
    }
}
