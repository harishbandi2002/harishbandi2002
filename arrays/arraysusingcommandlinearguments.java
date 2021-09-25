public class arraysusingcommandlinearguments {
    public static void main(String[]args){
        int[] n = {1,6,2,7,1,6,3,4,7,6,6,7,7};
        int sum = 0;
        outer:
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 6) {
                for (int j = i + 1; j < n.length; j++) {
                    if (n[j] == 7) {
                        i = j;
                        continue outer;
                    }
                }
            }
            sum += n[i];
        }
        System.out.println(sum); // 2
    }
}
