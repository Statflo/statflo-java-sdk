# UserCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**username** | **String** |  | 
**firstName** | **String** |  | 
**lastName** | **String** |  | 
**company** | **String** |  |  [optional]
**email** | **String** |  | 
**password** | **String** |  | 
**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional]
**salesRepId** | **String** |  |  [optional]
**externalLocationId** | **String** |  |  [optional]
**districtId** | **Integer** |  |  [optional]
**regionId** | **Integer** |  |  [optional]
**lastLogin** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**timezone** | **String** |  |  [optional]
**theme** | [**ThemeEnum**](#ThemeEnum) |  |  [optional]
**token** | **String** |  |  [optional]
**tokenParagon** | **String** |  |  [optional]
**userActive** | **Boolean** |  |  [optional]
**inboundAvailable** | **Boolean** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**acceptedTermsConditions** | **Boolean** |  |  [optional]
**appointmentReminderEmail** | **Boolean** |  |  [optional]
**dealerId** | **Integer** |  | 
**roleId** | **Integer** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**permissions** | **List&lt;Object&gt;** |  | 
**outletId** | **String** |  |  [optional]

<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN | &quot;en&quot;
FR | &quot;fr&quot;

<a name="ThemeEnum"></a>
## Enum: ThemeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
