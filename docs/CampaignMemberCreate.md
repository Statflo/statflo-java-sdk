# CampaignMemberCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**accountId** | **String** |  | 
**phoneNumber** | **String** |  | 
**accountName** | **String** |  |  [optional]
**campaignId** | **Integer** |  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**secondaryDealerId** | **String** |  |  [optional]
**campaignNickname** | **String** |  |  [optional]
**source** | [**SourceEnum**](#SourceEnum) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**excludeDnc** | **String** |  |  [optional]
**excludeDncDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**excludeKill** | **String** |  |  [optional]
**excludeDuplicate** | **String** |  |  [optional]
**excludeTerminated** | **String** |  |  [optional]
**excludeTerminatedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**excludePrepaid** | **String** |  |  [optional]
**excludeNoDealerMatch** | **String** |  |  [optional]
**excludeArchived** | **String** |  |  [optional]
**excludeLegacy** | **String** |  |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
API | &quot;api&quot;
SALESFORCE | &quot;salesforce&quot;
ADDTOCAMPAIGN | &quot;addToCampaign&quot;
