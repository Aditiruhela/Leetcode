class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i < n1; i++) {
            int target = arr1[i];
            boolean found = false;
            int nextGreater = -1;

            // find target in arr2
            for (int j = 0; j < n2; j++) {

                if (arr2[j] == target) {
                    found = true;

                    // scan right side to find ANY next greater element
                    for (int k = j + 1; k < n2; k++) {
                        if (arr2[k] > target) {
                            nextGreater = arr2[k];
                            break;
                        }
                    }

                    break;  // target matched, stop j loop
                }
            }

            arr1[i] = nextGreater;
        }

        return arr1;
    }
}
