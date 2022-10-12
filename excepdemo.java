class excepdemo{
public static void main(String[] args){
int array[] =new int[10]; 
for(int i=1;i<10;i++){
try{array[i]=i;
System.out.println(array[i]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index "+i+" is out of bound");
}
}
}
}