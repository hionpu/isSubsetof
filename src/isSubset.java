public class isSubset {
    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        boolean ans = true;
        if (sample.length == 0) return true;
        for (int i = 0; i < sample.length; i++){
            boolean isEle = false;
            for (int j = 0; j < base.length; j++) {
                isEle = isEle || sample[i] == base[j];
            }
            ans = ans && isEle;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        System.out.println(isSubsetOf(base,sample));

    }
}
