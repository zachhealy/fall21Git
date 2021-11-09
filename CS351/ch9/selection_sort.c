#include<stdio.h>

int[] selection_sort(arr[]);

int main(){
    int arr[5];
    printf("Enter 5 ints: ");
    scanf("%d %d %d %d %d", arr[1], arr[2], arr[3], arr[4], arr[5]);
    selection_sort(arr, 5);

}
int[] selection_sort(int[] arr, int j){
    int temp;
    for(int i = 0; i < j; i++){
        if(arr[i] > arr[i+1]){
            temp = arr[i];

        }else{
            temp = arr[i-1];

        }

    }
    return selection_sort(arr, j-1);
}