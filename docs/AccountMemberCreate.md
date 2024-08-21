# AccountMemberCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** |  | 
**phoneNumber** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional]
**accountMemberName** | **String** |  |  [optional]
**service** | **String** |  |  [optional]
**product** | **String** |  |  [optional]
**serviceStartDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**serviceEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
I | &quot;I&quot;
L | &quot;L&quot;
C | &quot;C&quot;
D | &quot;D&quot;

<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN | &quot;en&quot;
FR | &quot;fr&quot;
