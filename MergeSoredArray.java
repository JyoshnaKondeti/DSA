class Merge {
    public int[] result(int[] array1, int[] array2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[k] = array1[i];
                i--;
            } else {
                array1[k] = array2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            array1[k] = array2[j];
            k--;
            j--;
        }

        return array1;
    }
}
