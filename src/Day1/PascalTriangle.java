package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> pascal = generatePascalTriangle(4);
        for(List<Integer> t : pascal){
            for(int num: t)
                System.out.print(num+ " ");
            System.out.println();
        }

    }

    public static List<List<Integer>> generatePascalTriangle(int rows){
        List<List<Integer>> res = new ArrayList<>();
        if(rows<1)
            return res;
        for(int i=0;i<rows;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    int toAdd = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    temp.add(toAdd);
                }
            }
            res.add(temp);
        }

        return res;
    }
}
