# InStoreActivityUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageTo** | **String** |  |  [optional]
**messageFrom** | **String** |  |  [optional]
**subject** | [**SubjectEnum**](#SubjectEnum) |  |  [optional]
**actionTaken** | [**ActionTakenEnum**](#ActionTakenEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**nextSteps** | [**NextStepsEnum**](#NextStepsEnum) |  |  [optional]
**nextDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**outcomeReason** | [**OutcomeReasonEnum**](#OutcomeReasonEnum) |  |  [optional]
**outcomeLocation** | **String** |  |  [optional]
**id** | **Integer** |  | 
**type** | **Integer** |  | 
**accountId** | **String** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dateUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recordSource** | **String** |  |  [optional]
**recordOwned** | **Integer** |  |  [optional]

<a name="SubjectEnum"></a>
## Enum: SubjectEnum
Name | Value
---- | -----
_3_DAY_FOLLOW_UP_CALL | &quot;3 Day Follow Up Call&quot;
_5_STAR | &quot;5 Star&quot;
BILL_ANALYSIS | &quot;Bill Analysis&quot;
CALL_FROM_CLIENT | &quot;Call from Client&quot;
CELLPHONE_REPAIR | &quot;Cellphone Repair&quot;
CHANGE_RATE_PLAN_OPTIONS | &quot;Change Rate Plan/Options&quot;
GENERAL | &quot;General&quot;
HARDWARE_UPGRADE_CALL | &quot;Hardware Upgrade Call&quot;
LINE_DATA_TRANSFER | &quot;Line/Data Transfer&quot;
MID_CONTRACT_CALL | &quot;Mid-Contract Call&quot;
OTHER | &quot;Other&quot;
PROSPECTING | &quot;Prospecting&quot;
RENEWAL_CALL | &quot;Renewal Call&quot;
SUPPORT_CALL | &quot;Support Call&quot;
TECHNICAL_SUPPORT | &quot;Technical Support&quot;
UPDATED_FILE | &quot;Updated File&quot;
UPSELL_CALL | &quot;Upsell Call&quot;
WELCOME_RENEWAL | &quot;Welcome - Renewal&quot;

<a name="ActionTakenEnum"></a>
## Enum: ActionTakenEnum
Name | Value
---- | -----
ADD_FEATURE | &quot;Add feature&quot;
ASKED_FOR_INFORMATION | &quot;Asked for Information&quot;
BILL_EXPLANATION | &quot;Bill explanation&quot;
CHANGE_RATE_PLAN | &quot;Change rate plan&quot;
COMPLETE | &quot;Complete&quot;
COMPLETED_SURVEY | &quot;Completed Survey&quot;
CONTACT_CALL_CENTRE | &quot;Contact Call Centre&quot;
CUSTOMER_OUT_OF_BUSINESS | &quot;Customer Out Of Business&quot;
CUSTOMER_OUT_OF_GEO_REACH | &quot;Customer Out Of Geo Reach&quot;
DNC | &quot;DNC&quot;
FOLLOW_UP_CALL | &quot;Follow Up call&quot;
INACCURATE_CONTACT_INFORMATION | &quot;Inaccurate Contact Information&quot;
INTERESTED | &quot;Interested&quot;
LEFT_VOICEMAIL | &quot;Left voicemail&quot;
LESS_THAN_50_EMPLOYEES | &quot;Less Than 50 Employees&quot;
NO_ANSWER | &quot;No answer&quot;
NOT_INTERESTED | &quot;Not Interested&quot;
NOT_INTERESTED_17 | &quot;Not interested&quot;
NOT_WARRANTY | &quot;Not warranty&quot;
SOLD | &quot;Sold&quot;
TRANSFER | &quot;Transfer&quot;
UNDER_WARRANTY | &quot;Under warranty&quot;
WRONG_CUSTOMER_NAME | &quot;Wrong Customer Name&quot;
WRONG_NUMBER | &quot;Wrong number&quot;

<a name="NextStepsEnum"></a>
## Enum: NextStepsEnum
Name | Value
---- | -----
CALL_BACK_SCHEDULED | &quot;Call back scheduled&quot;
CLIENT_CARE | &quot;Client care&quot;
COMPANY_OUT_OF_BUSINESS | &quot;Company Out of Business&quot;
COVERAGE_ISSUES | &quot;Coverage Issues&quot;
DEAC | &quot;Deac&quot;
DEMO | &quot;Demo&quot;
DEVICE_CARE | &quot;Device Care&quot;
DISSATISFIED | &quot;Dissatisfied&quot;
FOLLOW_UP_CALL | &quot;Follow Up Call&quot;
INDIFFERENT | &quot;Indifferent&quot;
MEETING | &quot;Meeting&quot;
MOVED | &quot;Moved&quot;
NO_LOANER | &quot;No loaner&quot;
NOT_THE_RIGHT_PERSON | &quot;Not the right person&quot;
ON_HOLD_DUE_TO_COVID_19 | &quot;On Hold due to COVID-19&quot;
PRICE | &quot;Price&quot;
PRODUCT | &quot;Product&quot;
QUOTE_SENT | &quot;Quote sent&quot;
RENEWED_AT_A_DIFFERENT_DEALER | &quot;Renewed at a different dealer&quot;
SATISFIED | &quot;Satisfied&quot;
SWITCHED | &quot;Switched&quot;
TO_ANOTHER_STORE | &quot;To another store&quot;
UNDER_CONTRACT | &quot;Under Contract&quot;
WITH_LOANER | &quot;With loaner&quot;
CALL_NONE | &quot;call_none&quot;

<a name="OutcomeReasonEnum"></a>
## Enum: OutcomeReasonEnum
Name | Value
---- | -----
CALL_BACK_SCHEDULED | &quot;Call back scheduled&quot;
CLIENT_CARE | &quot;Client care&quot;
COMPANY_OUT_OF_BUSINESS | &quot;Company Out of Business&quot;
COVERAGE_ISSUES | &quot;Coverage Issues&quot;
DEAC | &quot;Deac&quot;
DEMO | &quot;Demo&quot;
DEVICE_CARE | &quot;Device Care&quot;
DISSATISFIED | &quot;Dissatisfied&quot;
INDIFFERENT | &quot;Indifferent&quot;
MEETING_SET | &quot;Meeting set&quot;
MOVED | &quot;Moved&quot;
NO_LOANER | &quot;No loaner&quot;
NOT_THE_RIGHT_PERSON | &quot;Not the right person&quot;
ON_HOLD_DUE_TO_COVID_19 | &quot;On Hold due to COVID-19&quot;
PRICE | &quot;Price&quot;
PRODUCT | &quot;Product&quot;
QUOTE_SENT | &quot;Quote sent&quot;
RENEWED_AT_A_DIFFERENT_DEALER | &quot;Renewed at a different dealer&quot;
SATISFIED | &quot;Satisfied&quot;
SWITCHED | &quot;Switched&quot;
TO_ANOTHER_STORE | &quot;To another store&quot;
UNDER_CONTRACT | &quot;Under Contract&quot;
WITH_LOANER | &quot;With loaner&quot;
CALL_NONE | &quot;call_none&quot;
