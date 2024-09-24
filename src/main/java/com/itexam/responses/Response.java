package com.itexam.responses;

public class Response<T> 
{
    
    public String code = "SUCCESS";   // "SUCCESS"  or  other 
    public String message = "";  //message for user 

    // Data
   public T data  =null;
}
