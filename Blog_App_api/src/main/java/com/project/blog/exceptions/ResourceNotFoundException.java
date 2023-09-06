package com.project.blog.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	String ResourceName;
	String Fieldname;
	long fieldvalue;
	
	public ResourceNotFoundException(String ResourceName , String Fieldname , long fieldvalue) {
		super(String.format(" %s Not Found with %s : %l",Fieldname,fieldvalue ,ResourceName ));
		this.ResourceName=ResourceName;
		this.fieldvalue=fieldvalue;
		this.Fieldname=Fieldname;
	}

}
