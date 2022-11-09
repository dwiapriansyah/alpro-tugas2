public class Jawaban {
public static void main (String [] args){

//Integer
byte value_byte = 100;
short value_short = 20000;
int value_int = 3000000;
long value_long = 4000000000L;
System.out.println("Nilai tipe data byte = " + value_byte);
System.out.println("Nilai tipe data short = " + value_short);
System.out.println("Nilai tipe data int = " + value_int);
System.out.println("Nilai tipe data long = " + value_long);

//Floating
float short_pi = 3.14f;
double long_pi = 3.141592653589793d;
System.out.println("Nilai short pi = " + short_pi);
System.out.println("Nilai tipe long pi = " + long_pi);

//Char
char huruf_A = 'A', huruf_A_juga = 65;
char huruf_B = 'B', huruf_B_juga = 66;
char persen = '%', persen_juga = 37;
char tandakutip = '\'';
System.out.println(huruf_A+" dan "+huruf_A_juga);
System.out.println(huruf_B+" dan "+huruf_B_juga);
System.out.println(persen+" dan "+persen_juga);
System.out.println(tandakutip);

//Bolean
boolean ApakahHackerKeren = true;
boolean ApakahHackerJelek = false;
System.out.println(ApakahHackerKeren);
System.out.println(ApakahHackerJelek);

//String
String nama = "Hacker" ;
System.out.println(nama);

//lokal
int age = 24; //local variable
System.out.println("Umur Hacker : " + age);

}
}
