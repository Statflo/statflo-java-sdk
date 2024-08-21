# CampaignCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**campaignNickname** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  | 
**carrierAllowed** | **Boolean** |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
MONTHLY | &quot;monthly&quot;
ONCE | &quot;once&quot;
DAILY | &quot;daily&quot;

<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
MONTHLY | &quot;monthly&quot;
ONCE | &quot;once&quot;
DAILY | &quot;daily&quot;

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
I | &quot;I&quot;
D | &quot;D&quot;
C | &quot;C&quot;
B | &quot;B&quot;
L | &quot;L&quot;
