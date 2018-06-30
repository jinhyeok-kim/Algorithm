//
//  main.cpp
//  apt_7
//
//  Created by 김진혁 on 2018. 4. 22..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <iostream>
using namespace std;
int apt[200] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

int main(int argc, const char * argv[]) {
    // insert code here...
    int iter;
    int k;
    int n;
    int j = 0;
    int out[100] = {0};
    
    cin >> iter;
    for(j = 0; j<iter; j++){
        cin >> k;
        cin >> n;
        
        int i = 0;
        for (i=14; i<=(k*14+(n-1)); i++){
            if(i%14 == 0){
                apt[i] = 1;
            }else{
                apt[i] = apt[i-1] + apt[i-14];
                
            }
        }
        
        out[j] = apt[i-1];
    }
    for(int i = 0; i<j; i++){
        cout << out[i] << "\n";
    }
    
    return 0;
}
