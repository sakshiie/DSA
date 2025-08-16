class Narrowing{
public static void main(String[]args){

//double to all
System.out.println("double");
double d=23.89;
float f=(float)d;
System.out.println(f);

long l =(long)d;
System.out.println(l);

int i =(int)d;
System.out.println(i);

short s=(short)d;
System.out.println(s);

char ch=(char)d;
System.out.println(ch);

byte b=(byte)d;
System.out.println(b);

//float to all
System.out.println("float");
float f2=2.3f;
long l2=(long)f2;
System.out.println(l2);

int i2=(int)f2;
System.out.println(i2);

short s2=(short)f2;
System.out.println(s2);

char ch2 =(char)f2;
System.out.println(ch2);

byte b2=(byte)f2;
System.out.println(b2);

//long to all
System.out.println("long");
long l3=23;
int i3=(int)l3;
System.out.println(i3);

short s3=(short)l3;
System.out.println(s3);

char ch3=(char)l3;
System.out.println(ch3);

byte b3=(byte)l3;
System.out.println(b3);


//int to all
System.out.println("int");
int i4=22;
short s4= (short)i4;
System.out.println(s4);

char ch4=(char)i4;
System.out.println(ch4);

byte b4=(byte)i4;
System.out.println(b4);

//short to all
System.out.println("short");
short s5= 123;
char ch5=(char)s5;
System.out.println(ch5);

byte b5=(byte)s5;
System.out.println(b5);

//char to all
System.out.println("char");
char ch6='a';
short s6=(short)ch6;
System.out.println(s6);

byte b6=(byte)ch6;
System.out.println(b6);
}
}