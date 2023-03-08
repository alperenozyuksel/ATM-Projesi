import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("***********OZYUKSEL BANK'A HOSGELDINIZ*************");
        System.out.println();
        int balance = 2000;
        int right = 3;
        int secim;
        int yatirilanBalance;
        int cekilenpara;
        String userName;
        String password;
        while (right > 0) {
            System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
            userName = input.next();
            System.out.print("Lutfen Sifrenizi Giriniz : ");
            password = input.next();


            if (userName.equals("TheLeavinG") && password.equals("java123")) {

                do {
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : \n 1-Para Yatirma \n 2-Para Cekme \n 3-Bakiye Sorgulama \n 4-Cıkıs Yap");

                    secim = input.nextInt();


                    switch (secim) {
                        case 1:

                            System.out.print("Lutfen Gireceginiz Parayi Tuslayiniz ve Acilan Hazneye Paranızı Yatiriniz : ");
                            yatirilanBalance = input.nextInt();
                            balance +=yatirilanBalance;
                            System.out.println("Yeni Bakiyeniz : " + (balance + yatirilanBalance));
                            break;


                        case 2:

                            System.out.print("Lutfen Cekmek Istediginiz Parayi Tuslayiniz : ");
                            cekilenpara = input.nextInt();
                            if (cekilenpara > balance){
                                System.out.println("Bakiyeniz yetersiz, lütfen tekrar deneyiniz.");
                            }
                            balance-=cekilenpara;
                            System.out.print("Yeni Bakiyeniz : " + (balance - cekilenpara));
                            break;

                        case 3:

                            System.out.print("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.print("Iyi Gunler");
                            break;

                    }
                }

                while (secim != 4);


            } else {
                right--;
                System.out.print("SIFRENIZ YANLIS!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletşime geçiniz.");
                } else {
                    System.out.println("Giriş için kalan deneme hakkınız: " + right);
                }
            }
        }
    }
}






