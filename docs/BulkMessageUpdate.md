# BulkMessageUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**userId** | **Integer** |  | 
**templateId** | **String** |  | 
**campaignId** | **Integer** |  | 
**locationId** | **Integer** |  | 
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) |  |  [optional]
**provider** | **String** |  |  [optional]
**content** | **String** |  |  [optional]
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 

<a name="DeliveryStatusEnum"></a>
## Enum: DeliveryStatusEnum
Name | Value
---- | -----
SENDING | &quot;sending&quot;
FAILED | &quot;failed&quot;
COMPLETE | &quot;complete&quot;
