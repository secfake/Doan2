
import account.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import shop.enity.*;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        Gson gson = new Gson();
//        List<User> users = new ArrayList<>();
//        User user1 = new Staff("a", "abc", "abc", "abc", "029822", "abc", "saff");
//        User user2 = new Customer("av", "ac", "ac", "ac", "1222", "accs", "customer", 12);
//        System.out.println(user1.toString());
//       Customer customer =(Customer) user2;
//        System.out.println(customer.toString());
//        users.add(user1);
//        users.add(user2);
//        System.out.println(users.toString());
//        String json = gson.toJson(users);
//        System.out.println(json);
//        Type obj = new TypeToken<List<User>>(){}.getType();
//        List<User> temp = gson.fromJson(json,obj);
//        System.out.println(temp.toString());
//        Staff staff = (Staff) temp.get(0);
//        System.out.println(staff.toString());
////        System.out.println(data);
////        Type objType = new TypeToken<Classz>(){}.getType();
////        Classz classz1 = gson.fromJson(data,objType);
////        System.out.println(classz1);
//        String temp = gson.toJson(user);
//        System.out.println(temp);
//        User user1 = gson.fromJson(temp,User.class);
//        System.out.println(user1);
//        Student student = new Student("a", "abc", "abc", "098255255", "dsasaf", "student", 10);
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student);
//        Teacher teacher = new Teacher("a", "abc", "abc", "098255255", "dsasaf", "teccher", "abc");
//        List<Teacher> teachers = new ArrayList<>();
//        teachers.add(teacher);
//        teachers.add(teacher);
//
//
////        Type objType = new TypeToken<ArrayList<User>>(){}.getType();
////        ArrayList<User> list = gson.fromJson(data,objType);
////        System.out.println(list.toString());
//
//        Classz classz = new Classz(1, students);
//        List<Classz> classzs = new ArrayList<>();
//        classzs.add(classz);
//        classzs.add(classz);
//        Subject subject = new Subject(1);
//        List<Subject> subjects = new ArrayList<>();
//        subjects.add(subject);
//        subjects.add(subject);
//        School school = new School(teachers, students, classzs, subjects);
//        String json = gson.toJson(school);
////        System.out.println(data);
////        Type objType = new TypeToken<Classz>(){}.getType();
////        Classz classz1 = gson.fromJson(data,objType);
////        System.out.println(classz1);
//
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream("src/data/user.json");
//            byte[] data = json.getBytes("utf8");
//            fileOutputStream.write(data);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                fileOutputStream.close();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        School school1;
//        FileReader fileReader = null;
//        try {
//            File file = new File("src/data/user.json");
//            fileReader = new FileReader(file);
//            Type objType = new TypeToken<School>() {
//            }.getType();
//            school1 = gson.fromJson(fileReader, objType);
//            System.out.println(school1.toString());
//        } catch (Exception e) {
//            System.out.println();
//        } finally {
//            try {
//                fileReader.close();
//            } catch (Exception e) {
//                {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//        }
//        System.out.println(school.getClasszs().toString());
//    }
    }
}