package com.codemantra.alttext.api.model;

import java.util.ArrayList;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DetectedObject {

	String id;
	String element_name, parent_id, tag_name, alt_text_long;
	int reading_order, flag;
	Coordinate coordinate;
	ArrayList<DetectedObject> kids;
	float accuracy;

	public DetectedObject(String element_name, float x, float y, float width, float height, int row, int col,
			int reading_order, float accuracy) {
		this.element_name = element_name.toLowerCase();
		this.reading_order = reading_order;
		this.coordinate = new Coordinate(x, y, x + width, y + height, row, col);
		this.kids = new ArrayList<>();
		this.id = UUID.randomUUID().toString();
		this.parent_id = null;
		this.accuracy = accuracy;
		this.flag = 1;
	}

	public DetectedObject parent(String id) {
		this.parent_id = id;
		return this;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public DetectedObject tag(String tag_name) {
		this.tag_name = tag_name;
		return this;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getFlag() {
		return this.flag;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getAlt_text_long() {
		return alt_text_long;
	}

	public void setAlt_text_long(String alt_text_long) {
		this.alt_text_long = alt_text_long;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addKid(DetectedObject obj) {
		this.kids.add(obj);
	}

	public String getElement_name() {
		return element_name;
	}

	public void setElement_name(String element_name) {
		this.element_name = element_name;
	}

	public int getReading_order() {
		return reading_order;
	}

	public void setReading_order(int reading_order) {
		this.reading_order = reading_order;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public ArrayList<DetectedObject> getKids() {
		return this.kids;
	}

	public void setKids(ArrayList<DetectedObject> kids) {
		this.kids = kids;
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		ObjectMapper obj = new ObjectMapper();
		try {
			return obj.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}

class Coordinate {
	float xmin, ymin, xmax, ymax;
	int row, column;

	public Coordinate(float xmin, float ymin, float xmax, float ymax, int row, int column) {
		super();
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public float getXmin() {
		return xmin;
	}

	public void setXmin(float xmin) {
		this.xmin = xmin;
	}

	public float getYmin() {
		return ymin;
	}

	public void setYmin(float ymin) {
		this.ymin = ymin;
	}

	public float getXmax() {
		return xmax;
	}

	public void setXmax(float xmax) {
		this.xmax = xmax;
	}

	public float getYmax() {
		return ymax;
	}

	public void setYmax(float ymax) {
		this.ymax = ymax;
	}

}
