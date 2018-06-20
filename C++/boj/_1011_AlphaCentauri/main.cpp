//
//  main.cpp
//  Alpha_Centauri
//
//  Created by 김진혁 on 2018. 4. 21..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <iostream>
using namespace std;
long long answer[10000] = {0};
int main(int argc, const char * argv[]) {
    // insert code here...
    long long t;
    long long x;
    long long y;
    
    cin >> t;

    
    int test = 0;
    
    while(t>test){
        cin >> x;
        cin >> y;
        
        long long i = 0;
        long long j = 0;
        long long result = 0;
        
        long long num = y-x;
        while(result < 100000000000){
            if(j%2 == 1){
                i++;
                result = result + i;
            }
            else{
                result = result + i;
            }
            if(num <= result){
                answer[test] = j;
                break;
            }
            j++;
        }
        test++;
    }
    for(int i = 0; i < t; i++){
        cout << answer[i] << '\n';
    }
    return 0;
}
