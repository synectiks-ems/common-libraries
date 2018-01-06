/**
 * 
 */
package com.synectiks.commons.entities.dynamodb;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.synectiks.commons.constants.IConsts;
import com.synectiks.commons.constants.IDBConsts;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * @author Rajesh
 */
@DynamoDBTable(tableName = IDBConsts.Tbl_SUBSCRIBE)
@Document(indexName = IConsts.INDX_SUBSCRIBE, type = IConsts.INDX_TYPE_SUBSCRIBE)
public class Subscription extends Entity implements IESEntity {

	private static final long serialVersionUID = -558004277200177114L;

	@Field(type = FieldType.String, index = FieldIndex.not_analyzed)
	private String serviceId;
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed)
	private String customerId;

	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey(attributeName = IDBConsts.Col_ID)
	public String getId() {
		return id;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "{" + (serviceId != null ? "\"serviceId\": \"" + serviceId + "\", " : "")
				+ (customerId != null ? "\"customerId\": \"" + customerId + "\", " : "")
				+ (id != null ? "\"id\": \"" + id + "\", " : "")
				+ (createdAt != null ? "\"createdAt\": \"" + createdAt + "\", " : "")
				+ (updatedAt != null ? "\"updatedAt\": \"" + updatedAt + "\", " : "")
				+ (createdBy != null ? "\"createdBy\": \"" + createdBy + "\", " : "")
				+ (updatedBy != null ? "\"updatedBy\": \"" + updatedBy + "\"" : "") + "}";
	}

}
