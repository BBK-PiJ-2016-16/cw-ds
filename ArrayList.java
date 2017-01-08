public class ArrayList implements List{


	private  Object[] array;

	private int arraysize;

	private static final int maxsize = 10;

	

	//Constructors which creates an empty array of size maxsize

	public ArrayList(){
		array=new Object(maxsize)
		arraysize=0;
	}	
	
	public int size(){

		return arraysize;

	}
	
	
	public boolean isEmpty(){

		return (arraysize == 0);

	}
	
	
	
	
	