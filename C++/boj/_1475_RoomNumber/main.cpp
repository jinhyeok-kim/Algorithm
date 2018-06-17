//
//  main.cpp
//  room_number
//
//  Created by 김진혁 on 2018. 4. 21..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <iostream>
using namespace std;
int num_array[9] = {0};

int main(int argc, const char * argv[]) {
    // insert code here...
    int input;
    int number = 0;
    cin >> input;
    
    if(input == 0){
        cout << 1;
    }
    else{
        for(number = 0; number<7; number++){
            if(input == 0){
                break;
            }
            if(input % 10 == 9){
                num_array[6]++;
            }else{
            num_array[input % 10]++;
            }
            input /= 10;
        }
        if(num_array[6]%2 == 1){
            if(num_array[6] != 1){
                num_array[6] = num_array[6]/2+1;
            }
        }else{
            num_array[6] = num_array[6]/2;
        }
        int max = 0;
        for(int i = 0; i < 9; i++){
            if(max<num_array[i]){
                max = num_array[i];
            }
        }
        cout << max;
        
    }
    
    return 0;
}
