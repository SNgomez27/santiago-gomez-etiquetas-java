public class main{
		public static void main (String[] args){
		for (int i = 0 ;i < args.length;i++){
		try{
		System.out.println("argumentos" + i + ":" + args[i]);
	} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("error" + e.getMessage());
}
}
}
}
