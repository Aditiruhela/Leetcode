class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        boolean inc = false;
        boolean dec = false;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) return false;

            if (!dec) {
                if (arr[i] > arr[i - 1]) {
                    inc = true;
                } else {
                    if (!inc) return false; // decrease before increase
                    dec = true;
                }
            } else {
                if (arr[i] >= arr[i - 1]) return false; // increase again
            }
        }

        return inc && dec;
    }
}
