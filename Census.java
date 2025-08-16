class Census{
public static void main(String []args){
long curPop=312032486;
final long seconds =(365*24*60*60)*5;

long birth=seconds/7;
long death=seconds/13;
long immigrant=seconds/45;
long newPop=curPop+birth-death+immigrant;

System.out.println(newPop);
System.out.println(curPop);

}
}