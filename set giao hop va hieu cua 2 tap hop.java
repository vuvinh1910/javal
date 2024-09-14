import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> A = new LinkedHashSet<>();
        Set<Integer> B = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }

        Set<Integer> intersection = new TreeSet<>(A);
        intersection.retainAll(B);

        Set<Integer> diff_A_B = new TreeSet<>(A);
        diff_A_B.removeAll(B);

        Set<Integer> diff_B_A = new TreeSet<>(B);
        diff_B_A.removeAll(A);

        printSet(intersection);

        printSet(diff_A_B);

        printSet(diff_B_A);
    }

    public static void printSet(Set<Integer> set) {
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
