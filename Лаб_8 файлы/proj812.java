package proj801;
import java.io.*;
public class proj812 {
	// Проверяем первую букву
    public static boolean checkConsonant(String sss) {
        if (sss.length() == 0) {
            return false;
        }
        char ch = sss.charAt(0);
        ch = Character.toLowerCase(ch);
        String cons = "бвгджзйклмнпрстфхцчшщ";
        if (cons.indexOf(ch) >= 0) {
            return true;
        } else {
            return false;}}

    public static void main(String[] args) {
        String f1 = "E:/Papka1/FileLW3.txt";
        String f2 = "E:/Papka1/FileLW4.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {FileInputStream fis = new FileInputStream(f1);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);
            FileOutputStream fos = new FileOutputStream(f2);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            bw = new BufferedWriter(osw);

            String l;
            int i = 0;

            while ((l = br.readLine()) != null) {i++;
                String[] arr = l.split(" |,|!|\\.|\\?|\"|«|»|:|;|-");
                String temp = "";
                int c = 0;

                for (int j=0; j<arr.length; j++) {
                    if (arr[j].length()>0) {
                        if (checkConsonant(arr[j])) {
                            temp = temp + arr[j] + " ";
                            c++;}}}

                if (c > 0) {bw.write("Строка номер " + i + ": " + temp.trim());
                    bw.write(" (слов: " + c + ")");
                    bw.newLine();}}

            bw.flush();
            System.out.println("Успешное копирование в " + f2);}
        catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());} 
        finally {
            try {if (br != null) br.close();
                if (bw != null) bw.close();} catch (IOException ex) {
                System.out.println("Ошибка при закрытии потоков: " + ex.getMessage());
            }
}}}