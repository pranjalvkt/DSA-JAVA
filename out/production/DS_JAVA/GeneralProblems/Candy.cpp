#include <bits/stdc++.h>
using namespace std;


void find(vector<int> arr, int n, int k)
{
	sort(arr.begin(), arr.end());
	int b = ceil(n / k * 1.0);
	int min_sum = 0, max_sum = 0;

	for(int i = 0; i < b; i++)
	min_sum += arr[i];
	for(int i = 2; i < arr.size(); i++)
	max_sum += arr[i];

    // print difference
    cout << max_sum - min_sum << endl;

}


// Driver code
int main()
{
vector<int> arr = {3, 2, 1, 4};
int n = arr.size();
int k = 2;

// Function call
find(arr,n,k);
}
