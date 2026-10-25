#include <stdio.h>

int main(){
        float c,f;
        printf("Enter the celcius temperature : ");
        scanf("%f",&c);
        printf("The temperature in fahrenheit is : %f\n\n",(c*9/5)+32);
        printf("Enter the fahrenheit temperature : ");
        scanf("%f",&f);
        printf("The temperature in Celcius is : %f\n\n",(f-32)*5/9);
        return 0;
}
