class Solution {
    public boolean checkStrings(String s1, String s2) {
        StringBuilder o1=new StringBuilder();
        StringBuilder e1=new StringBuilder();
        StringBuilder o2=new StringBuilder();
        StringBuilder e2=new StringBuilder();
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                e1.append(s1.charAt(i));
                e2.append(s2.charAt(i));
            }else{
                o1.append(s1.charAt(i));
                o2.append(s2.charAt(i));
            }
        }
        char[]arr1=e1.toString().toCharArray();
        char[]arr2=o1.toString().toCharArray();
        char[]arr3=e2.toString().toCharArray();
        char[]arr4=o2.toString().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        return Arrays.equals(arr1,arr3) &&  Arrays.equals(arr2,arr4);
    }
}