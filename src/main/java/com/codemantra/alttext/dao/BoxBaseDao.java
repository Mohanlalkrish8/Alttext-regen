package com.codemantra.alttext.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.codemantra.alttext.api.model.AltText;
import com.codemantra.alttext.api.model.AmazonS3;

@Component
public interface BoxBaseDao {
	
	@Select("select s3_client_id, s3_client_secret, s3_bucket, s3_region  from amazon_s3 limit 1")
	public AmazonS3 getAmazonS3MetaData();

	@Select("select * from alt_text where status = #{status}")
	public List<AltText> altTextItems(@Param("status") Integer status);

	@Update("update alt_text set status = #{status} where unique_identifier = #{unique_identifier}")
	public void updateAltTextStatus(@Param("status") int status, @Param("unique_identifier") String unique_identifier);

	@Select("select s3_path from file where file_id in (select file_id from file_mapping where id = ${task_id}) and lower(name) like lower('%.zip%') limit 1")
	public String getS3URL(AltText altTextItem);

	@Select("select file_id	from file where file_id in (select file_id from file_mapping where id = ${task_id}) and lower(name)" + 
			"like lower('%.zip%') limit 1")
	public long getfileid(AltText altTextItem);

	@Update("update alt_text set alt_text_long = #{long_des} where unique_identifier = #{unique_identifier}")
	public void updatedescription(@Param("long_des") String long_des, @Param("unique_identifier") String unique_identifier);

}
