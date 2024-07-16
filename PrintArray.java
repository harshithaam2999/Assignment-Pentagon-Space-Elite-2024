public class PrintArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int last_index = arr.length - 1; 
        
        if (arr == null) {
            System.out.println("null");
        } else if (last_index == -1) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i <= last_index; i++) { 
                System.out.print(arr[i]);
                if (i == last_index) {
                    System.out.println("]");
                } else {
                    System.out.print(", ");
                }
            }
        }
    }
}


	

