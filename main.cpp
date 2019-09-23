#include <iostream>
#include "ostream"
#include <bits/stdc++.h>
int PHI(int input) {
    int result = input;
    for (int i = 2; i*i <=input ; ++i) {
        if (input%i==0){
            while (input%i==0)
                input/=i;
            result -=result/i;
        }
    }
    if (input > 1)
        result -= result / input;
    return result;
}
using namespace std;
int main() {
    int T;
    cin>>T;
    int input;
    for (int i = 0; i < T; ++i) {
        cin>>input;
        cout<<PHI(input)<<endl;
    }

}

