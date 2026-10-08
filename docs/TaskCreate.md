# TaskCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**description** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userIdAssigned** | **Integer** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**id** | **Integer** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**accountId** | **String** |  | 
**dateAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dateUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recordSource** | **String** |  |  [optional]
**recordOwned** | **Integer** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
TO_DO | &quot;To Do&quot;
IN_PROGRESS | &quot;In Progress&quot;
BLOCKED | &quot;Blocked&quot;
COMPLETED | &quot;Completed&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8
NUMBER_9 | 9
NUMBER_10 | 10
NUMBER_11 | 11
NUMBER_12 | 12
NUMBER_13 | 13
NUMBER_14 | 14
NUMBER_15 | 15
NUMBER_16 | 16
NUMBER_18 | 18
NUMBER_19 | 19
NUMBER_20 | 20
NUMBER_24 | 24
NUMBER_25 | 25
NUMBER_27 | 27
NUMBER_32 | 32
NUMBER_38 | 38
NUMBER_40 | 40
NUMBER_41 | 41
NUMBER_42 | 42
NUMBER_43 | 43
NUMBER_99 | 99
