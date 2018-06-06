//
//  main.cpp
//  Hotel
//
//  Created by 김진혁 on 2018. 4. 21..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <iostream>
using namespace std;
int room[1000000] = {0};
int test[1000000] = {0};

int main(int argc, const char * argv[]) {
    // insert code here...
    int t;
    cin >> t;
    
    int tst = 0;
    while(tst<t){
        int h;
        cin >> h;
        int w;
        cin >> w;
        
        int n;
        cin >> n;
        
        int num = 0;
        for(int j = 1; j <= w; j++){
                for(int i = 1; i <= h; i++){
                        room[num] = i*100+j;
                        num++;
                    }
        }
        test[tst] = room[n-1];
        tst++;
    }

    for(int i = 0; i < t; i++){
        cout << test[i] << '\n';
    }
    
    return 0;
}
