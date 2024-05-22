// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;


int main() {
    int input;
    
    scanf("%d", &input);
    if (input % 2 == 0) {
        printf("Bob");
    } else {
        printf("Alice");
    }
    return 0;
}