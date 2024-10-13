public class CozaLozaWoza {
    public static void main(String[] args) {
        System.out.println("This is a programed called CozaLozaWoza.");
        int sum = 0;
        for (int i = 1; i < 11; i++){
            for(int j=1; j<=11; j++){
                sum = sum + 1;
                if((sum % 3 == 0) && (sum % 5 == 0 )) {
                    String CozaLoza = "CozaLoza";
                    System.out.printf("%10s", CozaLoza);
                }
                else if(sum % 3 == 0){
                    String Coza = "Coza";
                    System.out.printf("%6s", Coza);
                }
                else if(sum % 5 == 0) {
                    String Loza = "Loza";
                    System.out.printf("%6s", Loza);
                }
                else if(sum % 7 == 0){
                        String Woza = "Woza";
                        System.out.printf("%6s", Woza);
                }
                else{
                    System.out.printf("%4d", sum);
                }
            }
            System.out.println();
        }
    }
}
