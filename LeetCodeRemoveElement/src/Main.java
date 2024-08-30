public class Main {
    public static void main(String[] args) {

        int[] valores = {3, 2, 2, 3};
        int k = removeElement(valores, 3);

        System.out.println(k);

        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " ");
        }

    }

    static int removeElement(int[] nums, int val) {

        int ponteiro = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[ponteiro] = nums[i];
                ponteiro++;
            }
        }

        return ponteiro;
    }

}