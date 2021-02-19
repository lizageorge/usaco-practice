//---------------------------------------------------//

// USACO 2018 December Silver, Problem 3; Teleportation 
// February 16th, 2021



//---------------------------------------------------//

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;

void setIO(string s){ //this function is the template that redefines the standard IO
    ios_base::sync_with_stdio(0);cin.tie(0);
    freopen((s+".in").c_str(),"r",stdin);
    freopen((s+".out").c_str(),"w",stdout);
}

int main()
{
    // setIO("repeater");
    setIO("teleport");   

    //---------------------BEGIN---------------------//

    // This problem should have been masively oversimplified with algebra first. 
    // after looking at the USACO answer guide, I now understand that I should have tried
    // mapping a function f(y) that tracks total distance compared to y by first finding
    // "breakpoints" of y where f(y) would be lowest and calculating the changes in the slope of f(y)
    // at those points. Using those slope changes, I could have mapped all of f(y), keeping track of 
    // and submitting the lowest value of f(y) in that process.
    // ...
    // I have a lot to learn lol. My current first instict is still to find a brute-force solution
    // to every problem. I definitely couldn't have thought all of that up during a comp.    



    int N; cin>>N;
    // cout<<N<<endl;
    int ans =0;
    int min =0;
    int max =0;

    // cout<<min<<endl;
    // cout<<max<<endl;

    vector<vector<int>> grid(N);

    for( int i = 0; i < N; i++){
        int a, b; cin>>a>> b;

        grid[i] = vector<int>(2);
        grid[i][0] = a;
        grid[i][1] = b;

        if(a <= min){
            min = a;
        }
        if(b <= min){
            min = b;
        }
        if(a  >= max){
            max = a;
        }
        if( b>=max){
            max = b;
        }

        // int d = abs(b-a);
        // cout<<a<<endl;
        // cout<<b<<endl;
        // ans += d;
    }


    // for(int i = 0; i < N; i++)
    // {
    //     for (int j = 0; j < 2; j++)
    //     {
    //         cout << grid[i][j] << " ";
    //     }    
    //     cout << endl;
    // }

    // cout<<min<<endl;
    // cout<<max<<endl;

    int y_ = min;
    int d_ = 0;
    for(int i = 0; i < N; i++)
    {
        int a = grid[i][0];
        int b = grid[i][1];

        int ans_ = 0;
        //using teleporter
        int d_1 = abs(a) + abs(b-y_);
        int d_2 = abs(a -y_) + abs(b);

        //not using teleporter
        int d_3 = abs(a-b);

        // cout<<d_1<<endl;
        // cout<<d_2<<endl;
        // cout<<d_3<<endl;

        ans_ = d_1;
        if(d_2<ans_){
            ans_ = d_2;
        }
        if(d_3< ans_){
            ans_ = d_3;
        }   

        d_ += ans_;
    }
    ans = d_;
    for(int y =min+1; y<=max; y++){
        d_ = 0;
        for(int i = 0; i < N; i++)
        {
            int a = grid[i][0];
            int b = grid[i][1];

            int ans_ = 0;
            //using teleporter
            int d_1 = abs(a) + abs(b-y);
            int d_2 = abs(a -y) + abs(b);

            //not using teleporter
            int d_3 = abs(a-b);

            // cout<<d_1<<endl;
            // cout<<d_2<<endl;
            // cout<<d_3<<endl;

            ans_ = d_1;
            if(d_2<ans_){
                ans_ = d_2;
            }
            if(d_3< ans_){
                ans_ = d_3;
            }   

            d_ += ans_;
        }
        if( d_ < ans){
            ans = d_;
        }
    }

    cout<<ans<<endl;

    return 0;



    // cout<<a<<endl;
    // cout<<b<<endl;
    // cout<<x<<endl;
    // cout<<y<<endl;


    //using teleporter
    // int d_1 = abs(a -x) + abs(b-y);
    // int d_2 = abs(a -y) + abs(b-x);

    // //not using teleporter
    // int d_3 = abs(a-b);

    // // cout<<d_1<<endl;
    // // cout<<d_2<<endl;
    // // cout<<d_3<<endl;

    // ans = d_1;
    // if(d_2<ans){
    //     ans = d_2;
    // }
    // if(d_3< ans){
    //     ans = d_3;
    // }
    
    

}
