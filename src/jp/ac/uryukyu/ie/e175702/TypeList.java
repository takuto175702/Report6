/*package jp.ac.uryukyu.ie.e175702;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TypeList {
    public static void typelist (){

        try{
            FileReader file = new FileReader("/Users/e175702/IdeaProjects/report6/src/jp/ac/uryukyu/ie/e175702/Test.txt");
            BufferedReader br = new BufferedReader(file);

            String line = br.readLine();
            String[] typelist = line.split(",",0);

            int num;
            num = typelist.length;

        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public String Question(int num){
        int ran = (int)(Math.random()*num);//0~2の間でランダムに生成される
    }
}
*/
