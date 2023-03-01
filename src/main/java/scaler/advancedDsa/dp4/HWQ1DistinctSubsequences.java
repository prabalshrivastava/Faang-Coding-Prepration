package scaler.advancedDsa.dp4;



public class HWQ1DistinctSubsequences {

  //  Problem Description
//  Given two sequences A and B, count number of unique ways in sequence A, to form a subsequence that is identical to the sequence B.
//      Subsequence : A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
//  Problem Constraints
//1 <= length(A), length(B) <= 700
//  Input Format
//  The first argument of input contains a string A.
//  The second argument of input contains a string B.
//      Output Format
//  Return an integer representing the answer as described in the problem statement.
//  Example Input
//  Input 1:
//  A = "abc"
//  B = "abc"
//  Input 2:
//  A = "rabbbit"
//  B = "rabbit"
//  Example Output
//  DocFinder.Output 1:
//      1
//  Output 2:
//      3
//  Example Explanation
//  Explanation 1:
//  Both the strings are equal.
//      Explanation 2:
//  These are the possible removals of characters:
//      => A = "ra_bbit"
//      => A = "rab_bit"
//      => A = "rabb_it"
//  Note: "_" marks the removed character.
  public static void main(String[] args) {
    String input1A = "abc";
    String input1B = "abc";
    System.out.println(new HWQ1DistinctSubsequences().numDistinct(input1A, input1B));
    String input2A = "rabbbit";
    String input2B = "rabbit";
    System.out.println(new HWQ1DistinctSubsequences().numDistinct(input2A, input2B));
  }

  public int numDistinct(String A, String B) {

    return 0;
  }
}