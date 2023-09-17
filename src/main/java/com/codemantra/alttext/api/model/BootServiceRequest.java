/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codemantra.alttext.api.model;

import java.io.File;
import java.util.List;

/**
 *
 * @author codemantra
 */
public class BootServiceRequest {
    private String name;
    private String s3url;
    private File file;
    private Boolean img_cal;
    private List<File> fileList;
    private String[] s3urls;
    public String[] getS3urls() {
		return s3urls;
	}

	public void setS3urls(String[] s3urls) {
		this.s3urls = s3urls;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	public BootServiceRequest(){super();}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the s3url
     */
    public String getS3url() {
        return s3url;
    }

    /**
     * @param s3url the s3url to set
     */
    public void setS3url(String s3url) {
        this.s3url = s3url;
    }

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
     * @return the img_cal
     */
    public Boolean getImg_cal() {
        return img_cal;
    }

    /**
     * @param img_cal the img_cal to set
     */
    public void setImg_cal(Boolean img_cal) {
        this.img_cal = img_cal;
    }
}
