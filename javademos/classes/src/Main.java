public class Main {

    public static void main(String[] args) {
        //class'lar referans tiptirler.
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //diziler referans tiplerdir aynı classlar gibi.
        int[] sayi3=new int[]{1,2,3};
        int[] sayi4=new int[]{4,5,6};
        sayi4=sayi3;
        sayi3[0]=10;
        System.out.println(sayi4[0]);

    }
}
