# NotificationLogCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**dealerId** | **Integer** |  |  [optional]
**userId** | **Integer** |  | 
**payload** | **Object** |  | 
**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**recordSource** | **String** |  |  [optional]
**deliveredAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 

<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
BROWSER | &quot;browser&quot;
SMS | &quot;sms&quot;
EMAIL | &quot;email&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
APPOINTMENT | &quot;appointment&quot;
