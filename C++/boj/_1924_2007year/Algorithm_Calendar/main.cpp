//
//  main.cpp
//  Algorithm_Calendar
//
//  Created by 김진혁 on 2018. 4. 21..
//  Copyright © 2018년 김진혁. All rights reserved.
//

#include <iostream>
using namespace std;
int day[365] = {0};
char week[7][4] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

int main(int argc, const char * argv[]) {
    // insert code here...
    int month;
    int date;
    cin >> month;
    cin >> date;
    
    for(int i = 0, j = 0; i < 365; i++, j++){
        if(j == 7){
            j = 0;
        }
        day[i] = j;
    }
    int result = 211;
    int space = month - 8;
    
    if(month == 1){
        cout << week[day[date-1]];
    }
    else if(space < 5 && space >= -5){
        if(space == 0){
            cout << week[day[result + date]];
        }
        else if(space < 0){
            for(int i = 0; i < -space; i++){
                if(i%2 == 0){
                    result = result - 31;
                }
                else{
                    result = result - 30;
                }
            }
            cout << week[day[result + date]];
        }
        else{
            for(int i = 0; i < space; i++){
                if(i%2 == 0){
                    result = result + 31;
                }
                else{
                    result = result + 30;
                }
            }
            cout << week[day[result + date]];
        }
    }
    else{
        cout << week[day[date+30]];
    }
    return 0;
}
