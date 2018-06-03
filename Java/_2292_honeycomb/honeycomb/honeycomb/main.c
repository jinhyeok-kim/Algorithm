//
//  main.c
//  honeycomb
//
//  Created by 김진혁 on 2018. 4. 22..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <stdio.h>

int main(){
    long long unsigned int room;
    scanf("%lld", &room);
    
    if(room == 1){
        printf("%d", 1);
    }
    else{
        for(int i = 2; i < 20000; i++){
            int long long unsigned min = 3*(i-1)*(i-1) - 3*(i-1) + 2;
            int long long unsigned max = 3*i*i - 3*i + 1;
            
            if(min <= room && room <= max ){
                printf("%lld", i);
                break;
            }
            
        }
    }
    
    
    return 0;
}
