import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ArrayList<String> privateNbr = new ArrayList<>();

        System.out.println(getPrivateNbr(1,1,1000,privateNbr));

        for(String j:privateNbr){
            System.out.printf("%s ", j);
        }

    }

    public static double getPrivateNbr(int nbr, int count, int limit, ArrayList<String> privNbr){
        boolean isPrivate = true;

        if(nbr>0){
            if(count!=limit) {
                for (int i = nbr-1; i > 1; i--) {
                    if(nbr % i == 0){
                        isPrivate = false;
                        break;
                    }
                }

                if(isPrivate){
                    /*if(nbr%2==0) {*/
                        privNbr.add(String.valueOf(nbr));
                    /*}*/
                    count++;
                }

                getPrivateNbr(nbr+1, count, limit, privNbr);
            }
            else {

                return 0;
            }
        }
        return nbr;
    }
}