package collectionsExercise;
// Find duplicate elements in an array.
//In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).

import java.util.Scanner;

public class MemorizeMe {

    public static void main(String[] args) {
        int N, Q, S, result;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Q = sc.nextInt();

        for (int j = 0; j < Q; j++) {
            S = sc.nextInt();
            result = findOccurences(arr, S);

            if (result == 0) {
                System.out.println("NOT PRESENT");
            } else {
                System.out.println(result);
            }
        }

    }

    static int findOccurences(int[] array, int s) {
        int res = 0;
        for (int k : array) {
            if (k == s) {
                res++;
            }
        }
        return res;
    }

}
