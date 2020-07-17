package com.ahstu.jk.view;

import java.util.*;

public class TSUtility {
    private static Scanner scanner=new Scanner(System.in);
    /**
     * �÷�����ȡ���̣�����û����롮1-4���е������ַ����򷽷����أ�����ֵΪ�û������ַ�
     */
    public static char readMenuSelection(){
        char c;
        for (; ; ){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.print("ѡ��������������룺");
            }else break;
        }
        return c;
    }
    /**
    *�÷�����ʾ���ȴ���ֱ���û����س����󷵻�
     */
    public static void readReturn() {
        System.out.print("���س�������...");
        readKeyBoard(100,true);
    }
    /**
     *  �÷����Ӽ��̶�ȡһ�����Ȳ�����2λ����������������Ϊ�����ķ���ֵ
     */
    public static int readInt(){
        int n;
        for (; ;){
            String str=readKeyBoard(2,false);
            try {
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.print("��������������������룺");
            }
        }
        return n;
    }
    /**
     * �Ӽ��̶�ȡ'Y'��'N'����������Ϊ�����ķ���ֵ
     */
    public static char readConfirmSelection(){
        char c;
        for (; ;){
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if (c=='Y'||c=='N'){
                break;
            }else {
                System.out.print("ѡ��������������룺");
            }
        }
        return c;
    }
    public static String readKeyBoard(int limit,boolean blankReutrn){
        String line = "";
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length()==0){
                if(blankReutrn) return line;
                else continue;
            }
            if (line.length()<1||line.length()>limit){
                System.out.print("���볤�ȣ�������"+limit+"���������������룺");
                continue;
            }
            break;
        }
        return line;
    }
}
