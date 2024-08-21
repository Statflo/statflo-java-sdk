# AccountCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**accountId** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**externalUserId** | **String** |  |  [optional]
**externalLocationId** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**numberOfCampaignMembers** | **Integer** |  |  [optional]
**dealValue** | **String** |  |  [optional]
**lastSpokenDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastActivityDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**prevExternalUserId** | **String** |  |  [optional]
**status** | **Integer** |  | 
**attempt** | **Integer** |  | 
**callType** | **Integer** |  |  [optional]
**callDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**originalExternalUserId** | **String** |  |  [optional]
**website** | **String** |  |  [optional]
**sourceId** | **Integer** |  |  [optional]
**source** | **String** |  | 
**customerExternalId** | **String** |  |  [optional]
**brandId** | **Integer** |  |  [optional]
**seatType** | **String** |  |  [optional]
**rptBu** | **String** |  |  [optional]
**recordOwned** | **Boolean** |  |  [optional]
**accountSubtype** | **String** |  |  [optional]

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
I | &quot;I&quot;
L | &quot;L&quot;
C | &quot;C&quot;
D | &quot;D&quot;
