#include<stdio.h>

void reverse(char* ptr){
    char temp;

    for(int i = 0; i <= 8; i+= 4){
        temp = ptr[i];
        ptr[i] = ptr[i+2];
        ptr[i+2] = temp;

    }

}
int main(){
    char a[] = {'a', 'b', 'c' '-', 'd', 'e', 'f', '-', 'x', 'y', 'z'};
    char* ptr = a;
    int i;

    reverse(ptr);
    
    for(int i = 0; i < 11; i++){
        printf("%c", ptr[i];

    }
    printf("\n");
    return 0;
}