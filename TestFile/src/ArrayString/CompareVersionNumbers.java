package ArrayString;
/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Example 1:
Input: version1 = "0.1", version2 = "1.1"
Output: -1

Example 2:
Input: version1 = "1.0.1", version2 = "1"
Output: 1

Example 3:
Input: version1 = "7.5.2.4", version2 = "7.5.3"
Output: -1
 */
public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        //first to find the length of the strings
        String versio1 = version1.replaceAll("^0*","00");
        String versio2 = version2.replaceAll("^0*","00");
        int len1 = versio1.length(); int len2 = versio2.length();
        int len = Math.min(len1,len2);




        int flag = 0;
        int flag1= 0;
        int flag2 =0;


        for(int i=0; i<len; i++){
            if(versio1.charAt(i)*1 > versio2.charAt(i)*1){
                flag1 += 1;
                i++;
            }
            else if (versio1.charAt(i)*1 == versio2.charAt(i)*1){
                i++;
            }
            else{
                flag2 += 1;
                i++;
            }
        }

        if(flag1 > flag2) return 1;
        else if (flag1 < flag2) return -1;
        else return 0;

    }

    public static void main(String[] args){
        String v1 = "1";
        String v2 = "0";
        System.out.println(compareVersion(v1,v2));
    }
}
