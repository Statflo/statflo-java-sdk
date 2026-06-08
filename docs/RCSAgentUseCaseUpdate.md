# RCSAgentUseCaseUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**organicWebsiteTrafficMonthly** | **Integer** |  |  [optional]
**hasExistingShortCodeTraffic** | **Boolean** |  |  [optional]
**existingShortCodeNumber** | **String** |  |  [optional]
**existingShortCodeTrafficMonthly** | **Integer** |  |  [optional]
**rbmTrafficForecastMonthly** | **Integer** |  |  [optional]
**campaignOverview** | **String** |  |  [optional]
**messagingFlow** | **String** |  |  [optional]
**helpSampleMessage** | **String** |  |  [optional]
**stopSampleMessage** | **String** |  |  [optional]
**messageServiceType** | [**MessageServiceTypeEnum**](#MessageServiceTypeEnum) |  |  [optional]
**accessInstructions** | **String** |  |  [optional]
**optInDescription** | **String** |  |  [optional]
**optOutDescription** | **String** |  |  [optional]
**screenshotUrls** | **List&lt;String&gt;** |  | 
**triggerEventDescription** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**videoUrls** | **List&lt;String&gt;** |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="MessageServiceTypeEnum"></a>
## Enum: MessageServiceTypeEnum
Name | Value
---- | -----
TWO_FACTOR_AUTHENTICATION | &quot;two-factor-authentication&quot;
ACCOUNT_NOTIFICATION | &quot;account-notification&quot;
EMERGENCY_ALERTS | &quot;emergency-alerts&quot;
FRAUD_ALERTS | &quot;fraud-alerts&quot;
PROMOTIONAL_MARKETING | &quot;promotional-marketing&quot;
SWEEPSTAKES_AND_CONTEST | &quot;sweepstakes-and-contest&quot;
CONVERSATIONAL_MESSAGING | &quot;conversational-messaging&quot;
VOTING_AND_POLLING | &quot;voting-and-polling&quot;
DONATION_PLEDGE | &quot;donation-pledge&quot;
EDUCATION | &quot;education&quot;
POLITICAL | &quot;political&quot;
SECURITY_ALERTS | &quot;security-alerts&quot;
SOCIAL_MEDIA | &quot;social-media&quot;
LOAN_ARRANGEMENT | &quot;loan-arrangement&quot;
DELIVERY_NOTIFICATION | &quot;delivery-notification&quot;
PUBLIC_SERVICE_ANNOUNCEMENTS | &quot;public-service-announcements&quot;
AGE_GATED_CONTENT | &quot;age-gated-content&quot;
SOLE_PROPRIETORSHIP | &quot;sole-proprietorship&quot;
ON_BEHALF_OF_CARRIER | &quot;on-behalf-of-carrier&quot;
PLATFORM_FREE_TRIAL | &quot;platform-free-trial&quot;
MACHINE_TO_MACHINE | &quot;machine-to-machine&quot;
BUSINESS_OPERATIONS | &quot;business-operations&quot;
