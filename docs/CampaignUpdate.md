# CampaignUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**campaignNickname** | **String** |  | 
**totangoName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional]
**lifetime** | **String** |  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  |  [optional]
**carrierAllowed** | **Boolean** |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional]
**dncScrub** | **Boolean** |  |  [optional]
**reportingPeriodType** | **String** |  |  [optional]
**reportingPeriodBefore** | **Integer** |  |  [optional]
**reportingPeriodAfter** | **Integer** |  |  [optional]
**transactionEarliest** | **String** |  |  [optional]
**transactionLatest** | **String** |  |  [optional]
**productTypes** | **String** |  |  [optional]
**source** | [**SourceEnum**](#SourceEnum) |  |  [optional]
**visibilityCrm** | **Integer** |  |  [optional]
**visibilityReport** | **Integer** |  |  [optional]

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

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
PROVIDED | &quot;provided&quot;
GENERATED | &quot;generated&quot;

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
I | &quot;I&quot;
L | &quot;L&quot;
C | &quot;C&quot;
D | &quot;D&quot;
IB | &quot;IB&quot;

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
API | &quot;api&quot;
UPLOADED | &quot;uploaded&quot;
GENERATED | &quot;generated&quot;
