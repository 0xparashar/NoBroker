import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class IndexSet{
    int first;
    int second;

    IndexSet(int i, int j){
        this.first = i;
        this.second = j;
    }

}


public class Main {

    public static void main(String args[]){

        System.out.println("Size of array: ");
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        System.out.println("Inputs to array: ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=reader.nextInt();
        }

        System.out.println("Sum: ");

        int m = reader.nextInt();

        HashMap<Integer, ArrayList<IndexSet>> twoSum = new HashMap<Integer, ArrayList<IndexSet>>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(twoSum.containsKey(arr[i]+arr[j])){
                    ArrayList<IndexSet> temp = (ArrayList<IndexSet>)twoSum.get(arr[i]+arr[j]);
                    temp.add(new IndexSet(i,j));
                    twoSum.put(arr[i]+arr[j], temp);
                }else{
                    ArrayList<IndexSet> temp = new ArrayList<IndexSet>();
                    temp.add(new IndexSet(i,j));
                    twoSum.put(arr[i]+arr[j], temp);

                }
            }
        }

        for(int i=0; i<n; i++){
            if(twoSum.containsKey(m-arr[i])){
                for(IndexSet index: twoSum.get(m-arr[i])){
                    if(index.first>i){
                        System.out.println(i+" "+index.first+" "+index.second);
                    }
                }
            }
        }

    }

}
