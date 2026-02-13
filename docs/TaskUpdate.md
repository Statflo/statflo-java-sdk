# TaskUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**userIdAssigned** | **Integer** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**id** | **Integer** |  | 
**type** | **Integer** |  | 
**userId** | **Integer** |  |  [optional]
**dealerId** | **Integer** |  |  [optional]
**accountId** | **String** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recordSource** | **String** |  |  [optional]
**sourceId** | **String** |  |  [optional]
**recordOwned** | **Boolean** |  |  [optional]
**description** | **String** |  | 
**actionTaken** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
TO_DO | &quot;To Do&quot;
IN_PROGRESS | &quot;In Progress&quot;
BLOCKED | &quot;Blocked&quot;
COMPLETED | &quot;Completed&quot;
