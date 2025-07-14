import java.util.Scanner;
import java.util.Arrays;
public class arratStore {

    public static void main(String[] args) {
        arratStore a = new arratStore();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the array Elements:");
    for (int i =0; i<n; i++){
        nums[i]=sc.nextInt();
    }
        System.out.println("Printing array elements in for loop");
        for (int i =0; i<n; i++){
            System.out.print(nums[i]+ "\t");

        }
        System.out.println("\nPrinting array elements using while loop");
        int j=0;
        while(j<n){
            System.out.print(nums[j]+ "\t");
            j++;
        }
        Arrays.sort(nums);
        System.out.println("\nSorted array ="+ Arrays.toString(nums));
        System.out.println("Enter the number to count how many times it appeared in the array");
        int target = sc.nextInt();
        int count =0;
        for (int i : nums ){
            if(i==target){
                count++;
            }
        }
        System.out.println("The number of times "+ target +" appered ="+ count);
        System.out.println("Enter the index at which element should be added:");
        int new_index=sc.nextInt();
        System.out.println("Enter the element that needs to be inserted:");
        int new_ele = sc.nextInt();
        int[] copied_array = new int[n+1];
        for (int i=0;i<new_index;i++){
            copied_array[i] = nums[i];
        }
        copied_array[new_index] = new_ele;
        for(int i=new_index;i<n;i++){
            copied_array[new_index+1]=nums[i];
        }
        System.out.println("Updtaed array="+ Arrays.toString(copied_array));
        System.out.println("After removing duplicate elements in the array:");
        for (int i=0;i<n;i++){
            boolean isDuplicate = false;
            for(int k=0;k<i;k++){
                if(nums[i]==nums[k]){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                System.out.print(nums[i]+ " ");
            }

        }
    }
}
