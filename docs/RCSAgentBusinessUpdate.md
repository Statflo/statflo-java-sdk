# RCSAgentBusinessUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**industry** | [**IndustryEnum**](#IndustryEnum) |  |  [optional]
**legalName** | **String** |  |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional]
**stockExchange** | **String** |  |  [optional]
**stockSymbol** | **String** |  |  [optional]
**registrationNumber** | **String** |  |  [optional]
**registrationIssuingCountryIsoCode** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="IndustryEnum"></a>
## Enum: IndustryEnum
Name | Value
---- | -----
AGRICULTURE | &quot;AGRICULTURE&quot;
COMMUNICATION | &quot;COMMUNICATION&quot;
CONSTRUCTION | &quot;CONSTRUCTION&quot;
EDUCATION | &quot;EDUCATION&quot;
ENERGY | &quot;ENERGY&quot;
ENTERTAINMENT | &quot;ENTERTAINMENT&quot;
FINANCIAL | &quot;FINANCIAL&quot;
GAMBLING | &quot;GAMBLING&quot;
GOVERNMENT | &quot;GOVERNMENT&quot;
HEALTHCARE | &quot;HEALTHCARE&quot;
HOSPITALITY | &quot;HOSPITALITY&quot;
HUMAN_RESOURCES | &quot;HUMAN_RESOURCES&quot;
INSURANCE | &quot;INSURANCE&quot;
LEGAL | &quot;LEGAL&quot;
MANUFACTURING | &quot;MANUFACTURING&quot;
NON_PROFIT | &quot;NON_PROFIT&quot;
POLITICAL | &quot;POLITICAL&quot;
POSTAL | &quot;POSTAL&quot;
PROFESSIONAL | &quot;PROFESSIONAL&quot;
REAL_ESTATE | &quot;REAL_ESTATE&quot;
RETAIL | &quot;RETAIL&quot;
TECHNOLOGY | &quot;TECHNOLOGY&quot;
TRANSPORTATION | &quot;TRANSPORTATION&quot;

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
SOLE_PROPRIETORSHIP | &quot;Sole Proprietorship&quot;
GOVERNMENT | &quot;Government&quot;
NON_PROFIT | &quot;Non-Profit&quot;
PUBLIC | &quot;Public&quot;
PRIVATE | &quot;Private&quot;
