class Engine
{
   int cc;
   int capacity;
   int hp;

   Engine(){}

   Engine(int cc, int capacity, int hp){
   this.cc=cc;
   this.capacity=capacity;
   this.hp=hp; 
   }
public void displayEngine(){
	System.out.println(cc);
	System.out.println(capacity);
	System.out.println(hp);

}
  
}
