package jp.ac.uryukyu.ie.e175702;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println();


        Scanner ans = new Scanner(System.in);//プレイヤーが入力した文字列を読み取る。
        String str = ans.next();
        System.out.println(str);
    }
       /*public static String typelist () {

            try {
                FileReader file = new FileReader("/Users/e175702/IdeaProjects/report6/src/jp/ac/uryukyu/ie/e175702/Test.txt");
                BufferedReader br = new BufferedReader(file);

                String line = br.readLine();
                return line;


            } catch (FileNotFoundException e) {
                System.out.println(e);
                return "";
            } catch (IOException e) {
                System.out.println(e);
                return "";
            }

        }*/
       public String typelist() {
           try {
               BufferedReader br = Files.newBufferedReader(Paths.get(file));
               String line = br.readLine();
               while (line != null) {
                   txtdata += line + "\n";
                   line = br.readLine();
               }
               br.close();
               return txtdata;
           } catch (NoSuchFileException e) {
               System.out.println("エラー：.txtファイルが存在しません");
           } catch (IOException e) {
               e.printStackTrace();
           }
           return "error";

       }
        public static void Question(){
                String line = typelist();
                String[] tl = line.split(",", 0);
                int num = tl.length;
                int ran = (int)(Math.random()*num);//0~2の間でランダムに生成されru
                String qus = tl[ran];
        }



}