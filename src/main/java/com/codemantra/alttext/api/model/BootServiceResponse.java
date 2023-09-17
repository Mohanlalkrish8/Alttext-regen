package com.codemantra.alttext.api.model;

import java.io.Serializable;
import java.util.ArrayList;

public class BootServiceResponse implements Serializable {
	 
	//String responseMessage="success";
	Object data;
	private String code;
        private String status;
        private String statusMessage;
     
	public BootServiceResponse(int type){
		if(type==2){
			data = new ArrayList();
		}
	}
	
	public BootServiceResponse(){
		
	}
	
	 
	
	 
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * @param statusMessage the statusMessage to set
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
	
}
