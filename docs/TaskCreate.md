# TaskCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userIdAssigned** | **Integer** |  | 
**priority** | **Integer** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**id** | **Integer** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**accountId** | **String** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recordSource** | **String** |  |  [optional]
**sourceId** | **String** |  |  [optional]
**recordOwned** | **Boolean** |  |  [optional]
**description** | **String** |  | 
**actionTaken** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]
**assignedFrom** | **String** |  |  [optional]
**assignedTo** | **String** |  |  [optional]
**name** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_7 | 7
NUMBER_38 | 38
NUMBER_40 | 40
NUMBER_41 | 41
NUMBER_4_6 | 4
NUMBER_5_7 | 5
NUMBER_7_8 | 7
NUMBER_38_9 | 38
NUMBER_40_10 | 40
NUMBER_41_11 | 41

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
TO_DO | &quot;To Do&quot;
IN_PROGRESS | &quot;In Progress&quot;
BLOCKED | &quot;Blocked&quot;
COMPLETED | &quot;Completed&quot;
