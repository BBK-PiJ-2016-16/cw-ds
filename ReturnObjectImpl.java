abstract public class ReturnObjectImpl implements ReturnObject {
	
	private boolean errorflag;
	private String errormsg;
	public Object object;
	
	private boolean hasError(boolean errorflag){
		return errorflag;
    }
	
		
	public class ErrorMessage{
		String errormsg;
	
		ErrorMessage(String errormsg){   // constructor used for error message
			this.errormsg=errormsg;
		}
		
	
		String getError(){
			
			if (hasError(true)){
				return errormsg;
			}			
			else{
				errormsg="No_Error";
				return errormsg;
			}
		
		}

	}

	public class Object{
		String value;
		
		Object(String Value){     //constructor for return value
			this.value=value;
		}
		
		Object object=new Object(null);
		
		Object getReturnValue(Object object){
			if(hasError(true)){
				return object;
			}
			return
		}
			
	}
}