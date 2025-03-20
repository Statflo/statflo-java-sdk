# statflo-java-sdk

Statflo API
- SDK version: V4.1.124
  - Build date: 2025-03-20T20:15:05.814297111Z[Etc/UTC]

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users
Add the JitPack repository to your build file

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.github.Statflo</groupId>
  <artifactId>statflo-java-sdk</artifactId>
  <version>V4.1.124</version>
</dependency>
```

### Gradle users
Add it in your root build.gradle at the end of repositories:
```groovy
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

Add this dependency to your project's build file:

```groovy
dependencies {
        implementation 'com.github.Statflo:statflo-java-sdk:V4.1.124'
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/statflo-java-sdk-V4.1.124.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.AccountActionsApi;
import com.statflo.client.model.AccountActionPaginationResponse;
import com.statflo.client.model.AccountActionSummary;

import java.util.HashMap;

public class AccountActionExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        AccountActionsApi accountActionsApi = new AccountActionsApi(apiClient);

        HashMap<String, String> filter = new HashMap<>();
        AccountActionPaginationResponse accountActionPaginationResponse = accountActionsApi.accountActionSearch(filter, "", 1, 10, "");
        for (AccountActionSummary item : accountActionPaginationResponse.getItems()) {
            System.out.println(item);
        }
    }
}


import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.api.CampaignsApi;
import com.statflo.client.model.CampaignPaginationResponse;
import com.statflo.client.model.CampaignSummary;

import java.util.HashMap;

public class CampaignExample {
    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(Config.HOST);
        apiClient.setAccessToken(Config.accessToken);

        CampaignsApi campaignsApi = new CampaignsApi(apiClient);
        HashMap<String, String> filter = new HashMap<>();

        CampaignPaginationResponse campaignPaginationResponse = campaignsApi.campaignSearch(filter, "", 1, 10, "");
        for (CampaignSummary campaignSummary : campaignPaginationResponse.getItems()) {
            System.out.println(campaignSummary);
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.statflo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountActionsApi* | [**accountActionCreate**](docs/AccountActionsApi.md#accountActionCreate) | **POST** /v4/api/account-action | 
*AccountActionsApi* | [**accountActionGet**](docs/AccountActionsApi.md#accountActionGet) | **GET** /v4/api/account-action/{id} | 
*AccountActionsApi* | [**accountActionSearch**](docs/AccountActionsApi.md#accountActionSearch) | **GET** /v4/api/account-action | 
*AccountContactMetadataApi* | [**accountContactMetadata**](docs/AccountContactMetadataApi.md#accountContactMetadata) | **GET** /v4/api/account-contact-metadata | 
*AccountContactMetadataApi* | [**accountContactMetadataCreate**](docs/AccountContactMetadataApi.md#accountContactMetadataCreate) | **POST** /v4/api/account-contact-metadata | 
*AccountContactMetadataApi* | [**accountContactMetadataDelete**](docs/AccountContactMetadataApi.md#accountContactMetadataDelete) | **DELETE** /v4/api/account-contact-metadata/{id} | 
*AccountContactMetadataApi* | [**accountContactMetadataGet**](docs/AccountContactMetadataApi.md#accountContactMetadataGet) | **GET** /v4/api/account-contact-metadata/{id} | 
*AccountContactMetadataApi* | [**accountContactMetadataUpdate**](docs/AccountContactMetadataApi.md#accountContactMetadataUpdate) | **PUT** /v4/api/account-contact-metadata/{id} | 
*AccountCredentialsApi* | [**accountCredentialCreate**](docs/AccountCredentialsApi.md#accountCredentialCreate) | **POST** /v4/api/account-credential | 
*AccountCredentialsApi* | [**accountCredentialGet**](docs/AccountCredentialsApi.md#accountCredentialGet) | **GET** /v4/api/account-credential/{id} | 
*AccountCredentialsApi* | [**accountCredentialSearch**](docs/AccountCredentialsApi.md#accountCredentialSearch) | **GET** /v4/api/account-credential | 
*AccountCredentialsApi* | [**accountCredentialUpdate**](docs/AccountCredentialsApi.md#accountCredentialUpdate) | **PUT** /v4/api/account-credential/{id} | 
*AccountMembersApi* | [**accountMemberCreate**](docs/AccountMembersApi.md#accountMemberCreate) | **POST** /v4/api/account-member | 
*AccountMembersApi* | [**accountMemberDelete**](docs/AccountMembersApi.md#accountMemberDelete) | **DELETE** /v4/api/account-member/{id} | 
*AccountMembersApi* | [**accountMemberGet**](docs/AccountMembersApi.md#accountMemberGet) | **GET** /v4/api/account-member/{id} | 
*AccountMembersApi* | [**accountMemberSearch**](docs/AccountMembersApi.md#accountMemberSearch) | **GET** /v4/api/account-member | 
*AccountMembersApi* | [**accountMemberUpdate**](docs/AccountMembersApi.md#accountMemberUpdate) | **PUT** /v4/api/account-member/{id} | 
*AccountNumberApi* | [**accountNumberGet**](docs/AccountNumberApi.md#accountNumberGet) | **GET** /v4/api/account-number/{id} | 
*AccountNumberApi* | [**accountNumberSearch**](docs/AccountNumberApi.md#accountNumberSearch) | **GET** /v4/api/account-number | 
*AccountsApi* | [**accountCreate**](docs/AccountsApi.md#accountCreate) | **POST** /v4/api/account | 
*AccountsApi* | [**accountDelete**](docs/AccountsApi.md#accountDelete) | **DELETE** /v4/api/account/{id} | 
*AccountsApi* | [**accountGet**](docs/AccountsApi.md#accountGet) | **GET** /v4/api/account/{id} | 
*AccountsApi* | [**accountSearch**](docs/AccountsApi.md#accountSearch) | **GET** /v4/api/account | 
*AccountsApi* | [**accountUpdate**](docs/AccountsApi.md#accountUpdate) | **PUT** /v4/api/account/{id} | 
*AuthenticationApi* | [**authMe**](docs/AuthenticationApi.md#authMe) | **GET** /v4/api/auth/me | 
*AuthenticationApi* | [**login**](docs/AuthenticationApi.md#login) | **POST** /v4/api/auth/login | 
*AuthenticationApi* | [**logout**](docs/AuthenticationApi.md#logout) | **GET** /v4/api/auth/logout | 
*AuthenticationApi* | [**switchDealer**](docs/AuthenticationApi.md#switchDealer) | **GET** /v4/api/auth/switch | 
*CampaignMemberApi* | [**campaignMemberCreate**](docs/CampaignMemberApi.md#campaignMemberCreate) | **POST** /v4/api/campaign-member | 
*CampaignMemberApi* | [**campaignMemberDelete**](docs/CampaignMemberApi.md#campaignMemberDelete) | **DELETE** /v4/api/campaign-member/{id} | 
*CampaignMemberApi* | [**campaignMemberGet**](docs/CampaignMemberApi.md#campaignMemberGet) | **GET** /v4/api/campaign-member/{id} | 
*CampaignMemberApi* | [**campaignMemberSearch**](docs/CampaignMemberApi.md#campaignMemberSearch) | **GET** /v4/api/campaign-member | 
*CampaignMemberApi* | [**campaignMemberUpdate**](docs/CampaignMemberApi.md#campaignMemberUpdate) | **PUT** /v4/api/campaign-member/{id} | 
*CampaignMetadataApi* | [**campaignMetadataCreate**](docs/CampaignMetadataApi.md#campaignMetadataCreate) | **POST** /v4/api/campaign-metadata | 
*CampaignMetadataApi* | [**campaignMetadataDelete**](docs/CampaignMetadataApi.md#campaignMetadataDelete) | **DELETE** /v4/api/campaign-metadata/{id} | 
*CampaignMetadataApi* | [**campaignMetadataGet**](docs/CampaignMetadataApi.md#campaignMetadataGet) | **GET** /v4/api/campaign-metadata/{id} | 
*CampaignMetadataApi* | [**campaignMetadataSearch**](docs/CampaignMetadataApi.md#campaignMetadataSearch) | **GET** /v4/api/campaign-metadata | 
*CampaignMetadataApi* | [**campaignMetadataUpdate**](docs/CampaignMetadataApi.md#campaignMetadataUpdate) | **PUT** /v4/api/campaign-metadata/{id} | 
*CampaignPropertiesApi* | [**campaignPropertyCreate**](docs/CampaignPropertiesApi.md#campaignPropertyCreate) | **POST** /v4/api/campaign-property | 
*CampaignPropertiesApi* | [**campaignPropertyDelete**](docs/CampaignPropertiesApi.md#campaignPropertyDelete) | **DELETE** /v4/api/campaign-property/{id} | 
*CampaignPropertiesApi* | [**campaignPropertyGet**](docs/CampaignPropertiesApi.md#campaignPropertyGet) | **GET** /v4/api/campaign-property/{id} | 
*CampaignPropertiesApi* | [**campaignPropertySearch**](docs/CampaignPropertiesApi.md#campaignPropertySearch) | **GET** /v4/api/campaign-property | 
*CampaignPropertiesApi* | [**campaignPropertyUpdate**](docs/CampaignPropertiesApi.md#campaignPropertyUpdate) | **PUT** /v4/api/campaign-property/{id} | 
*CampaignsApi* | [**campaignCreate**](docs/CampaignsApi.md#campaignCreate) | **POST** /v4/api/campaign | 
*CampaignsApi* | [**campaignDelete**](docs/CampaignsApi.md#campaignDelete) | **DELETE** /v4/api/campaign/{id} | 
*CampaignsApi* | [**campaignGet**](docs/CampaignsApi.md#campaignGet) | **GET** /v4/api/campaign/{id} | 
*CampaignsApi* | [**campaignSearch**](docs/CampaignsApi.md#campaignSearch) | **GET** /v4/api/campaign | 
*CampaignsApi* | [**campaignUpdate**](docs/CampaignsApi.md#campaignUpdate) | **PUT** /v4/api/campaign/{id} | 
*ContactsApi* | [**contactCreate**](docs/ContactsApi.md#contactCreate) | **POST** /v4/api/contact | 
*ContactsApi* | [**contactDelete**](docs/ContactsApi.md#contactDelete) | **DELETE** /v4/api/contact/{id} | 
*ContactsApi* | [**contactGet**](docs/ContactsApi.md#contactGet) | **GET** /v4/api/contact/{id} | 
*ContactsApi* | [**contactSearch**](docs/ContactsApi.md#contactSearch) | **GET** /v4/api/contact | 
*ContactsApi* | [**contactUpdate**](docs/ContactsApi.md#contactUpdate) | **PUT** /v4/api/contact/{id} | 
*ContentSharingCategoryApi* | [**contentSharingCategoryCreate**](docs/ContentSharingCategoryApi.md#contentSharingCategoryCreate) | **POST** /v4/api/content-sharing-category | 
*ContentSharingCategoryApi* | [**contentSharingCategoryDelete**](docs/ContentSharingCategoryApi.md#contentSharingCategoryDelete) | **DELETE** /v4/api/content-sharing-category/{id} | 
*ContentSharingCategoryApi* | [**contentSharingCategoryGet**](docs/ContentSharingCategoryApi.md#contentSharingCategoryGet) | **GET** /v4/api/content-sharing-category/{id} | 
*ContentSharingCategoryApi* | [**contentSharingCategorySearch**](docs/ContentSharingCategoryApi.md#contentSharingCategorySearch) | **GET** /v4/api/content-sharing-category | 
*ContentSharingCategoryApi* | [**contentSharingCategoryUpdate**](docs/ContentSharingCategoryApi.md#contentSharingCategoryUpdate) | **PUT** /v4/api/content-sharing-category/{id} | 
*ContentSharingLinkApi* | [**contentSharingLinkCreate**](docs/ContentSharingLinkApi.md#contentSharingLinkCreate) | **POST** /v4/api/content-sharing-link | 
*ContentSharingLinkApi* | [**contentSharingLinkDelete**](docs/ContentSharingLinkApi.md#contentSharingLinkDelete) | **DELETE** /v4/api/content-sharing-link/{id} | 
*ContentSharingLinkApi* | [**contentSharingLinkGet**](docs/ContentSharingLinkApi.md#contentSharingLinkGet) | **GET** /v4/api/content-sharing-link/{id} | 
*ContentSharingLinkApi* | [**contentSharingLinkSearch**](docs/ContentSharingLinkApi.md#contentSharingLinkSearch) | **GET** /v4/api/content-sharing-link | 
*ContentSharingLinkApi* | [**contentSharingLinkUpdate**](docs/ContentSharingLinkApi.md#contentSharingLinkUpdate) | **PUT** /v4/api/content-sharing-link/{id} | 
*ContentSharingRecommendApi* | [**contentSharingRecommendCreate**](docs/ContentSharingRecommendApi.md#contentSharingRecommendCreate) | **POST** /v4/api/content-sharing-recommend | 
*ContentSharingRecommendApi* | [**contentSharingRecommendedDelete**](docs/ContentSharingRecommendApi.md#contentSharingRecommendedDelete) | **DELETE** /v4/api/content-sharing-recommend/{id} | 
*ContentSharingRecommendApi* | [**contentSharingRecommendedGet**](docs/ContentSharingRecommendApi.md#contentSharingRecommendedGet) | **GET** /v4/api/content-sharing-recommend/{id} | 
*ContentSharingRecommendApi* | [**contentSharingRecommendedSearch**](docs/ContentSharingRecommendApi.md#contentSharingRecommendedSearch) | **GET** /v4/api/content-sharing-recommend | 
*ContentSharingRecommendApi* | [**contentSharingRecommendedUpdate**](docs/ContentSharingRecommendApi.md#contentSharingRecommendedUpdate) | **PUT** /v4/api/content-sharing-recommend/{id} | 
*ConversationsApi* | [**conversationCreate**](docs/ConversationsApi.md#conversationCreate) | **POST** /v4/api/conversation | 
*ConversationsApi* | [**conversationGet**](docs/ConversationsApi.md#conversationGet) | **GET** /v4/api/conversation/{id} | 
*ConversationsApi* | [**conversationSearch**](docs/ConversationsApi.md#conversationSearch) | **GET** /v4/api/conversation | 
*ConversationsApi* | [**conversationUpdate**](docs/ConversationsApi.md#conversationUpdate) | **PUT** /v4/api/conversation/{id} | 
*DealerAllowedFeaturesApi* | [**dealerAllowedFeatureCreate**](docs/DealerAllowedFeaturesApi.md#dealerAllowedFeatureCreate) | **POST** /v4/api/dealer-allowed-feature | 
*DealerAllowedFeaturesApi* | [**dealerAllowedFeatureDelete**](docs/DealerAllowedFeaturesApi.md#dealerAllowedFeatureDelete) | **DELETE** /v4/api/dealer-allowed-feature/{dealer}/{feature} | 
*DealersApi* | [**dealerGet**](docs/DealersApi.md#dealerGet) | **GET** /v4/api/dealer/{id} | 
*DealersApi* | [**dealerSearch**](docs/DealersApi.md#dealerSearch) | **GET** /v4/api/dealer | 
*DistrictsApi* | [**districtCreate**](docs/DistrictsApi.md#districtCreate) | **POST** /v4/api/district | 
*DistrictsApi* | [**districtDelete**](docs/DistrictsApi.md#districtDelete) | **DELETE** /v4/api/district/{id} | 
*DistrictsApi* | [**districtGet**](docs/DistrictsApi.md#districtGet) | **GET** /v4/api/district/{id} | 
*DistrictsApi* | [**districtSearch**](docs/DistrictsApi.md#districtSearch) | **GET** /v4/api/district | 
*DistrictsApi* | [**districtUpdate**](docs/DistrictsApi.md#districtUpdate) | **PUT** /v4/api/district/{id} | 
*FeaturesApi* | [**feature**](docs/FeaturesApi.md#feature) | **GET** /v4/api/feature | 
*FeaturesApi* | [**featureGet**](docs/FeaturesApi.md#featureGet) | **GET** /v4/api/feature/{id} | 
*LocationsApi* | [**locationGet**](docs/LocationsApi.md#locationGet) | **GET** /v4/api/location/{id} | 
*LocationsApi* | [**locationSearch**](docs/LocationsApi.md#locationSearch) | **GET** /v4/api/location | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentCreate**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentCreate) | **POST** /v4/api/message-template-assignment | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentDelete**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentDelete) | **DELETE** /v4/api/message-template-assignment/{id} | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentGet**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentGet) | **GET** /v4/api/message-template-assignment/{id} | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentSearch**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentSearch) | **GET** /v4/api/message-template-assignment | 
*MessageTemplateAssignmentsApi* | [**messageTemplateAssignmentUpdate**](docs/MessageTemplateAssignmentsApi.md#messageTemplateAssignmentUpdate) | **PUT** /v4/api/message-template-assignment/{id} | 
*MessageTemplatesApi* | [**messageTemplateCreate**](docs/MessageTemplatesApi.md#messageTemplateCreate) | **POST** /v4/api/message-template | 
*MessageTemplatesApi* | [**messageTemplateDelete**](docs/MessageTemplatesApi.md#messageTemplateDelete) | **DELETE** /v4/api/message-template/{id} | 
*MessageTemplatesApi* | [**messageTemplateGet**](docs/MessageTemplatesApi.md#messageTemplateGet) | **GET** /v4/api/message-template/{id} | 
*MessageTemplatesApi* | [**messageTemplateSearch**](docs/MessageTemplatesApi.md#messageTemplateSearch) | **GET** /v4/api/message-template | 
*MessageTemplatesApi* | [**messageTemplateUpdate**](docs/MessageTemplatesApi.md#messageTemplateUpdate) | **PUT** /v4/api/message-template/{id} | 
*MessagesApi* | [**messageCreate**](docs/MessagesApi.md#messageCreate) | **POST** /v4/api/message | 
*MessagesApi* | [**messageGet**](docs/MessagesApi.md#messageGet) | **GET** /v4/api/message/{id} | 
*MessagesApi* | [**messageSearch**](docs/MessagesApi.md#messageSearch) | **GET** /v4/api/message | 
*MessagesApi* | [**messageUpdate**](docs/MessagesApi.md#messageUpdate) | **PUT** /v4/api/message/{id} | 
*NotepadsApi* | [**notepadCreate**](docs/NotepadsApi.md#notepadCreate) | **POST** /v4/api/notepad | 
*NotepadsApi* | [**notepadGet**](docs/NotepadsApi.md#notepadGet) | **GET** /v4/api/notepad/{id} | 
*NotepadsApi* | [**notepadSearch**](docs/NotepadsApi.md#notepadSearch) | **GET** /v4/api/notepad | 
*NotepadsApi* | [**notepadUpdate**](docs/NotepadsApi.md#notepadUpdate) | **PUT** /v4/api/notepad/{id} | 
*RegionsApi* | [**regionCreate**](docs/RegionsApi.md#regionCreate) | **POST** /v4/api/region | 
*RegionsApi* | [**regionDelete**](docs/RegionsApi.md#regionDelete) | **DELETE** /v4/api/region/{id} | 
*RegionsApi* | [**regionGet**](docs/RegionsApi.md#regionGet) | **GET** /v4/api/region/{id} | 
*RegionsApi* | [**regionSearch**](docs/RegionsApi.md#regionSearch) | **GET** /v4/api/region | 
*RegionsApi* | [**regionUpdate**](docs/RegionsApi.md#regionUpdate) | **PUT** /v4/api/region/{id} | 
*TasksApi* | [**taskCreate**](docs/TasksApi.md#taskCreate) | **POST** /v4/api/task | 
*TasksApi* | [**taskDelete**](docs/TasksApi.md#taskDelete) | **DELETE** /v4/api/task/{id} | 
*TasksApi* | [**taskGet**](docs/TasksApi.md#taskGet) | **GET** /v4/api/task/{id} | 
*TasksApi* | [**taskSearch**](docs/TasksApi.md#taskSearch) | **GET** /v4/api/task | 
*TasksApi* | [**taskUpdate**](docs/TasksApi.md#taskUpdate) | **PUT** /v4/api/task/{id} | 
*TeamsApi* | [**teamCreate**](docs/TeamsApi.md#teamCreate) | **POST** /v4/api/team | 
*TeamsApi* | [**teamDelete**](docs/TeamsApi.md#teamDelete) | **DELETE** /v4/api/team/{id} | 
*TeamsApi* | [**teamGet**](docs/TeamsApi.md#teamGet) | **GET** /v4/api/team/{id} | 
*TeamsApi* | [**teamSearch**](docs/TeamsApi.md#teamSearch) | **GET** /v4/api/team | 
*TeamsApi* | [**teamUpdate**](docs/TeamsApi.md#teamUpdate) | **PUT** /v4/api/team/{id} | 
*UserExternalIdApi* | [**userExternalId**](docs/UserExternalIdApi.md#userExternalId) | **GET** /v4/api/user-external-id | 
*UserExternalIdApi* | [**userExternalIdCreate**](docs/UserExternalIdApi.md#userExternalIdCreate) | **POST** /v4/api/user-external-id | 
*UserExternalIdApi* | [**userExternalIdDelete**](docs/UserExternalIdApi.md#userExternalIdDelete) | **DELETE** /v4/api/user-external-id/{id} | 
*UserExternalIdApi* | [**userExternalIdGet**](docs/UserExternalIdApi.md#userExternalIdGet) | **GET** /v4/api/user-external-id/{id} | 
*UserExternalIdApi* | [**userExternalIdUpdate**](docs/UserExternalIdApi.md#userExternalIdUpdate) | **PUT** /v4/api/user-external-id/{id} | 
*UserTeamsApi* | [**userTeamCreate**](docs/UserTeamsApi.md#userTeamCreate) | **POST** /v4/api/user-team | 
*UserTeamsApi* | [**userTeamDelete**](docs/UserTeamsApi.md#userTeamDelete) | **DELETE** /v4/api/user-team/{team}/{user} | 
*UsersApi* | [**userGet**](docs/UsersApi.md#userGet) | **GET** /v4/api/user/{id} | 
*UsersApi* | [**userSearch**](docs/UsersApi.md#userSearch) | **GET** /v4/api/user | 
*VendorMessagesApi* | [**vendorMessageCreate**](docs/VendorMessagesApi.md#vendorMessageCreate) | **POST** /v4/api/vendor-message | 
*VendorMessagesApi* | [**vendorMessageGet**](docs/VendorMessagesApi.md#vendorMessageGet) | **GET** /v4/api/vendor-message/{id} | 
*VendorMessagesApi* | [**vendorMessageSearch**](docs/VendorMessagesApi.md#vendorMessageSearch) | **GET** /v4/api/vendor-message | 
*WidgetsApi* | [**v4ApiWidgetsCampaignsAccountIdGet**](docs/WidgetsApi.md#v4ApiWidgetsCampaignsAccountIdGet) | **GET** /v4/api/widgets/campaigns/{accountId} | 

## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountAction](docs/AccountAction.md)
 - [AccountActionCreate](docs/AccountActionCreate.md)
 - [AccountActionPaginationResponse](docs/AccountActionPaginationResponse.md)
 - [AccountActionSummary](docs/AccountActionSummary.md)
 - [AccountActionUpdate](docs/AccountActionUpdate.md)
 - [AccountContactMetadata](docs/AccountContactMetadata.md)
 - [AccountContactMetadataCreate](docs/AccountContactMetadataCreate.md)
 - [AccountContactMetadataPaginationResponse](docs/AccountContactMetadataPaginationResponse.md)
 - [AccountContactMetadataSummary](docs/AccountContactMetadataSummary.md)
 - [AccountContactMetadataUpdate](docs/AccountContactMetadataUpdate.md)
 - [AccountCreate](docs/AccountCreate.md)
 - [AccountCredential](docs/AccountCredential.md)
 - [AccountCredentialCreate](docs/AccountCredentialCreate.md)
 - [AccountCredentialPaginationResponse](docs/AccountCredentialPaginationResponse.md)
 - [AccountCredentialSummary](docs/AccountCredentialSummary.md)
 - [AccountCredentialUpdate](docs/AccountCredentialUpdate.md)
 - [AccountMember](docs/AccountMember.md)
 - [AccountMemberCreate](docs/AccountMemberCreate.md)
 - [AccountMemberPaginationResponse](docs/AccountMemberPaginationResponse.md)
 - [AccountMemberSummary](docs/AccountMemberSummary.md)
 - [AccountMemberUpdate](docs/AccountMemberUpdate.md)
 - [AccountNumber](docs/AccountNumber.md)
 - [AccountNumberPaginationResponse](docs/AccountNumberPaginationResponse.md)
 - [AccountNumberSummary](docs/AccountNumberSummary.md)
 - [AccountPaginationResponse](docs/AccountPaginationResponse.md)
 - [AccountSummary](docs/AccountSummary.md)
 - [AccountUpdate](docs/AccountUpdate.md)
 - [AuthLoginBody](docs/AuthLoginBody.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignCreate](docs/CampaignCreate.md)
 - [CampaignMapping](docs/CampaignMapping.md)
 - [CampaignMappingSummary](docs/CampaignMappingSummary.md)
 - [CampaignMember](docs/CampaignMember.md)
 - [CampaignMemberCreate](docs/CampaignMemberCreate.md)
 - [CampaignMemberPaginationResponse](docs/CampaignMemberPaginationResponse.md)
 - [CampaignMemberSummary](docs/CampaignMemberSummary.md)
 - [CampaignMemberUpdate](docs/CampaignMemberUpdate.md)
 - [CampaignMetadata](docs/CampaignMetadata.md)
 - [CampaignMetadataCreate](docs/CampaignMetadataCreate.md)
 - [CampaignMetadataPaginationResponse](docs/CampaignMetadataPaginationResponse.md)
 - [CampaignMetadataSummary](docs/CampaignMetadataSummary.md)
 - [CampaignMetadataUpdate](docs/CampaignMetadataUpdate.md)
 - [CampaignPaginationResponse](docs/CampaignPaginationResponse.md)
 - [CampaignProperty](docs/CampaignProperty.md)
 - [CampaignPropertyCreate](docs/CampaignPropertyCreate.md)
 - [CampaignPropertyPaginationResponse](docs/CampaignPropertyPaginationResponse.md)
 - [CampaignPropertySummary](docs/CampaignPropertySummary.md)
 - [CampaignPropertyUpdate](docs/CampaignPropertyUpdate.md)
 - [CampaignSummary](docs/CampaignSummary.md)
 - [CampaignUpdate](docs/CampaignUpdate.md)
 - [CampaignVisibility](docs/CampaignVisibility.md)
 - [CampaignVisibilityCreate](docs/CampaignVisibilityCreate.md)
 - [CampaignVisibilitySummary](docs/CampaignVisibilitySummary.md)
 - [CampaignVisibilityUpdate](docs/CampaignVisibilityUpdate.md)
 - [Carrier](docs/Carrier.md)
 - [CarrierCreate](docs/CarrierCreate.md)
 - [CarrierStatistics](docs/CarrierStatistics.md)
 - [CarrierStatisticsCreate](docs/CarrierStatisticsCreate.md)
 - [CarrierStatisticsSummary](docs/CarrierStatisticsSummary.md)
 - [CarrierStatisticsUpdate](docs/CarrierStatisticsUpdate.md)
 - [CarrierSummary](docs/CarrierSummary.md)
 - [CarrierUpdate](docs/CarrierUpdate.md)
 - [Contact](docs/Contact.md)
 - [ContactCreate](docs/ContactCreate.md)
 - [ContactPaginationResponse](docs/ContactPaginationResponse.md)
 - [ContactSummary](docs/ContactSummary.md)
 - [ContactUpdate](docs/ContactUpdate.md)
 - [ContentSharingCategory](docs/ContentSharingCategory.md)
 - [ContentSharingCategoryCreate](docs/ContentSharingCategoryCreate.md)
 - [ContentSharingCategoryPaginationResponse](docs/ContentSharingCategoryPaginationResponse.md)
 - [ContentSharingCategoryUpdate](docs/ContentSharingCategoryUpdate.md)
 - [ContentSharingLink](docs/ContentSharingLink.md)
 - [ContentSharingLinkCreate](docs/ContentSharingLinkCreate.md)
 - [ContentSharingLinkPaginationResponse](docs/ContentSharingLinkPaginationResponse.md)
 - [ContentSharingLinkUpdate](docs/ContentSharingLinkUpdate.md)
 - [ContentSharingRecommendPaginationResponse](docs/ContentSharingRecommendPaginationResponse.md)
 - [ContentSharingRecommended](docs/ContentSharingRecommended.md)
 - [ContentSharingRecommendedCreate](docs/ContentSharingRecommendedCreate.md)
 - [ContentSharingRecommendedUpdate](docs/ContentSharingRecommendedUpdate.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationCreate](docs/ConversationCreate.md)
 - [ConversationPaginationResponse](docs/ConversationPaginationResponse.md)
 - [ConversationSummary](docs/ConversationSummary.md)
 - [ConversationUpdate](docs/ConversationUpdate.md)
 - [Dealer](docs/Dealer.md)
 - [DealerAllowedFeature](docs/DealerAllowedFeature.md)
 - [DealerAllowedFeatureCreate](docs/DealerAllowedFeatureCreate.md)
 - [DealerCreate](docs/DealerCreate.md)
 - [DealerMetaData](docs/DealerMetaData.md)
 - [DealerMetaDataCreate](docs/DealerMetaDataCreate.md)
 - [DealerMetaDataSummary](docs/DealerMetaDataSummary.md)
 - [DealerMetaDataUpdate](docs/DealerMetaDataUpdate.md)
 - [DealerPaginationResponse](docs/DealerPaginationResponse.md)
 - [DealerSummary](docs/DealerSummary.md)
 - [DealerUpdate](docs/DealerUpdate.md)
 - [District](docs/District.md)
 - [DistrictCreate](docs/DistrictCreate.md)
 - [DistrictPaginationResponse](docs/DistrictPaginationResponse.md)
 - [DistrictSummary](docs/DistrictSummary.md)
 - [DistrictUpdate](docs/DistrictUpdate.md)
 - [Feature](docs/Feature.md)
 - [FeatureCreate](docs/FeatureCreate.md)
 - [FeaturePaginationResponse](docs/FeaturePaginationResponse.md)
 - [FeatureSummary](docs/FeatureSummary.md)
 - [FeatureUpdate](docs/FeatureUpdate.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Location](docs/Location.md)
 - [LocationCreate](docs/LocationCreate.md)
 - [LocationPaginationResponse](docs/LocationPaginationResponse.md)
 - [LocationSummary](docs/LocationSummary.md)
 - [LocationUpdate](docs/LocationUpdate.md)
 - [Message](docs/Message.md)
 - [MessageCreate](docs/MessageCreate.md)
 - [MessagePaginationResponse](docs/MessagePaginationResponse.md)
 - [MessageSummary](docs/MessageSummary.md)
 - [MessageTemplate](docs/MessageTemplate.md)
 - [MessageTemplateAssignment](docs/MessageTemplateAssignment.md)
 - [MessageTemplateAssignmentCreate](docs/MessageTemplateAssignmentCreate.md)
 - [MessageTemplateAssignmentPaginationResponse](docs/MessageTemplateAssignmentPaginationResponse.md)
 - [MessageTemplateAssignmentSummary](docs/MessageTemplateAssignmentSummary.md)
 - [MessageTemplateAssignmentUpdate](docs/MessageTemplateAssignmentUpdate.md)
 - [MessageTemplateCategory](docs/MessageTemplateCategory.md)
 - [MessageTemplateCreate](docs/MessageTemplateCreate.md)
 - [MessageTemplatePaginationResponse](docs/MessageTemplatePaginationResponse.md)
 - [MessageTemplateSummary](docs/MessageTemplateSummary.md)
 - [MessageTemplateUpdate](docs/MessageTemplateUpdate.md)
 - [MessageUpdate](docs/MessageUpdate.md)
 - [Notepad](docs/Notepad.md)
 - [NotepadCreate](docs/NotepadCreate.md)
 - [NotepadPaginationResponse](docs/NotepadPaginationResponse.md)
 - [NotepadSummary](docs/NotepadSummary.md)
 - [NotepadUpdate](docs/NotepadUpdate.md)
 - [Pagination](docs/Pagination.md)
 - [Permission](docs/Permission.md)
 - [PermissionCreate](docs/PermissionCreate.md)
 - [PermissionSummary](docs/PermissionSummary.md)
 - [PermissionUpdate](docs/PermissionUpdate.md)
 - [ReassignRep](docs/ReassignRep.md)
 - [ReassignRepCreate](docs/ReassignRepCreate.md)
 - [ReassignRepSummary](docs/ReassignRepSummary.md)
 - [ReassignRepUpdate](docs/ReassignRepUpdate.md)
 - [Region](docs/Region.md)
 - [RegionCreate](docs/RegionCreate.md)
 - [RegionPaginationResponse](docs/RegionPaginationResponse.md)
 - [RegionSummary](docs/RegionSummary.md)
 - [RegionUpdate](docs/RegionUpdate.md)
 - [Role](docs/Role.md)
 - [RoleCreate](docs/RoleCreate.md)
 - [RolePermission](docs/RolePermission.md)
 - [RolePermissionCreate](docs/RolePermissionCreate.md)
 - [RolePermissionSummary](docs/RolePermissionSummary.md)
 - [RolePermissionUpdate](docs/RolePermissionUpdate.md)
 - [RoleSummary](docs/RoleSummary.md)
 - [RoleUpdate](docs/RoleUpdate.md)
 - [Task](docs/Task.md)
 - [TaskCreate](docs/TaskCreate.md)
 - [TaskPaginationResponse](docs/TaskPaginationResponse.md)
 - [TaskSummary](docs/TaskSummary.md)
 - [TaskUpdate](docs/TaskUpdate.md)
 - [Team](docs/Team.md)
 - [TeamCreate](docs/TeamCreate.md)
 - [TeamPaginationResponse](docs/TeamPaginationResponse.md)
 - [TeamSummary](docs/TeamSummary.md)
 - [TeamUpdate](docs/TeamUpdate.md)
 - [Timeline](docs/Timeline.md)
 - [TimelineCreate](docs/TimelineCreate.md)
 - [TimelineSummary](docs/TimelineSummary.md)
 - [TimelineUpdate](docs/TimelineUpdate.md)
 - [User](docs/User.md)
 - [UserActivityLog](docs/UserActivityLog.md)
 - [UserActivityLogCreate](docs/UserActivityLogCreate.md)
 - [UserActivityLogSummary](docs/UserActivityLogSummary.md)
 - [UserActivityLogUpdate](docs/UserActivityLogUpdate.md)
 - [UserCreate](docs/UserCreate.md)
 - [UserExternalId](docs/UserExternalId.md)
 - [UserExternalIdCreate](docs/UserExternalIdCreate.md)
 - [UserExternalIdPaginationResponse](docs/UserExternalIdPaginationResponse.md)
 - [UserExternalIdSummary](docs/UserExternalIdSummary.md)
 - [UserExternalIdUpdate](docs/UserExternalIdUpdate.md)
 - [UserPaginationResponse](docs/UserPaginationResponse.md)
 - [UserPermission](docs/UserPermission.md)
 - [UserPermissionCreate](docs/UserPermissionCreate.md)
 - [UserPermissionSummary](docs/UserPermissionSummary.md)
 - [UserPermissionUpdate](docs/UserPermissionUpdate.md)
 - [UserSummary](docs/UserSummary.md)
 - [UserTeam](docs/UserTeam.md)
 - [UserTeamCreate](docs/UserTeamCreate.md)
 - [UserTeamSummary](docs/UserTeamSummary.md)
 - [UserTeamUpdate](docs/UserTeamUpdate.md)
 - [UserUpdate](docs/UserUpdate.md)
 - [VendorMessage](docs/VendorMessage.md)
 - [VendorMessageCreate](docs/VendorMessageCreate.md)
 - [VendorMessagePaginationResponse](docs/VendorMessagePaginationResponse.md)
 - [VendorMessageSummary](docs/VendorMessageSummary.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


