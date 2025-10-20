public class searchin {
    static int linear(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
     return -1;
    }
    static int binarySearch(int arr[],int key) //search by divide and con 
    {
        int low=0;
        int high=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            return mid;
            if(key<arr[mid])
            high=mid-1;
            else
            low=low+1;
        }
        return -1;
    }
    static int searchInsertPosition(int arr[],int key)//it will search the key in a array if the array does't have the value it will retrun the position to insert
    {
        int low=0;
        int high=arr.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
            return mid;
            if(key<arr[mid])
            high=mid-1;
            else
            low=low+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,46,55,64,9,86,94};
        System.out.println(binarySearch(arr, 9));
        System.out.println(searchInsertPosition(arr,6));
    }
}
