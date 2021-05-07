package com.test2;

import java.util.ArrayList;
import java.util.Scanner;

// 学生管理系统
public class StudentManager {


    public static void main (String[] args) {
        ArrayList<Student> List = new ArrayList<Student>();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生信息");
            System.out.println("5.退出");
            System.out.print("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent(List);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(List);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(List);
                    break;
                case "4":
//                    System.out.println("查看所有学生信息");
                    findAllStudent(List);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    // break;
                    System.exit(0);
            }
        }
    }

    public static void addStudent (ArrayList<Student> List) {

        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("学号：");
            id = sc.nextLine();

            boolean flag = isUsed(List, id);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.print("姓名：");
        String name = sc.nextLine();
        System.out.print("年龄：");
        String age = sc.nextLine();
        System.out.print("居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        List.add(s);
        System.out.println("添加学生成功");
    }
    public static void findAllStudent(ArrayList<Student> List) {
        if (List.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t居住地");
        for (int i=0; i< List.size(); i++) {
            Student s = List.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> List) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要删除的学生编号：");
        String id = sc.nextLine();

        int index = -1;
        for (int i=0; i< List.size(); i++) {
            Student s = List.get(i);
            if (s.getId().equals(id)) {
//                List.remove(i);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输出");
        } else {
            List.remove(index);
            System.out.println("删除学生信息成功");
        }
    }
    public static void updateStudent(ArrayList<Student> List) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要修改的学生的学号：");
        String id = sc.nextLine();

        System.out.print("新姓名：");
        String name = sc.nextLine();
        System.out.print("新年龄：");
        String age = sc.nextLine();
        System.out.print("新居住地：");
        String address = sc.nextLine();

        Student s = new Student(id,name,age,address);
        for (int i=0; i<List.size(); i++) {
            Student student = List.get(i);
            if (student.getId().equals(id)) {
                List.set(i,s);
                break;
            }
        }
    }
    public static boolean isUsed(ArrayList<Student> List, String id) {
        boolean flag = false;
        for (int i=0; i< List.size(); i++) {
            Student s = List.get(i);
            if (s.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

