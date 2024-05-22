// Online C++ compiler to run C++ program online
#include <iostream>

int main() {
    int n;
    scanf("%d", &n);
    float arr[n][2];
    float sum = 0;
    for (int i = 0; i < n; i++) {
        scanf("%f %f", &arr[n][0], &arr[n][1]);
        sum += arr[n][0] * arr[n][1];
    };
    
    printf("%.3f", sum);
    
    return 0;
}