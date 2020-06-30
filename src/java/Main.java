public class Main {
    public static void main(String[] args) {
        System.out.println("Удаление дубликатов. Время: O(n), память: O(1)");
        int[] nums = {1, 1, 2};
        System.out.print("Массив до: ");
        printArr(nums);
        System.out.println(removeDuplicates(nums));
        System.out.print("Массив после: ");
        printArr(nums);
        System.out.println();

        System.out.println("Подсчет простых чисел. Время: O(n^1.5), память: O(1)");
        System.out.println(countPrimes(10));
    }

    //удаление дубликатов O(n)
    public static int removeDuplicates(int[] nums) {
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == i + 1) {
                return length + 1;
            } else {
                if (nums[length] != nums[i + 1]) {
                    length++;
                    nums[length] = nums[i + 1];
                }
            }
        }
        return length + 1;
    }

    private static void printArr(int[] x) {
        System.out.print("{ ");
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println("}");
    }

    //подсчет простых чисел O(n^1.5)
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
