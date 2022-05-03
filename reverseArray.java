public class reverseArray {
    public static void main(String []a);

    int arr[] = {1,2,4,6,3};
    // int s =0;
    // int e = arr.length -1;
    // int temp;
    
    // while(s < e)
    // {
      
    //     temp = arr[s];
    //     arr[s] = arr[e];
    //     arr[e] = temp;
    //     s++;
    //     e--;
    // }

    // for(int j=0; j<arr.length; j++)
    // {
    //     System.out.print(arr[j]+" ");
    // }
    int l = arr.length;
    int loop = l/2;
    int temp;
    for(int i=0; i<loop; i++)
    {
        temp =arr[i];
        arr[i] = arr[l -i - 1];
        arr[l -i - 1] = temp;
    }
    for(int j=0; j<l; j++)
    {
        System.out.print(arr[j]+" ");
    }
    
}
