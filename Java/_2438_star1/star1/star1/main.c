//
//  main.c
//  star1
//
//  Created by 김진혁 on 2018. 4. 22..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <stdio.h>

int main(){
    int row;
    scanf("%d", &row);
    
    for(int i = 0; i < row; i++){
        for(int j = 0; j< i+1; j++){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}
