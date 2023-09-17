/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codemantra.alttext.api.model;

import java.io.File;
import java.util.Map;

/**
 *
 * @author codemantra
 */
public class ResponseModel {
    private File file;
    private int imageCount;
   // private int equationCount;
    private int pageCount;
    private String errorMessage;
    private String code;
    private Map<String, Object> responseMap;
    public ResponseModel(){}
    
    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the imageCount
     */
    public int getImageCount() {
        return imageCount;
    }

    /**
     * @param imageCount the imageCount to set
     */
    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

     /*
    public int getEquationCount() {
        return equationCount;
    }

     
    public void setEquationCount(int equationCount) {
        this.equationCount = equationCount;
    }
    */

    /**
     * @return the pageCount
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
     * @return the responseMap
     */
    public Map<String, Object> getResponseMap() {
        return responseMap;
    }

    /**
     * @param responseMap the responseMap to set
     */
    public void setResponseMap(Map<String, Object> responseMap) {
        this.responseMap = responseMap;
    }
}
