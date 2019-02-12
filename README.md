# API Call Practice
In this class we learned how to call an API from an Async Task on Android.

Using the sample url: https://reqres.in/api/users?page=2

You can receive a JSON with id, first name, second name and a link to an image which is the avatar. Once we receive it, we can display the info in an Android app.

###### Layouts and components needed:

**item_user**

|Components|Quantity|
|----------|--------|
|ImageView|1|
|TextView|2|

**activity_main**

|Components|Quantity|
|----------|--------|
|RecyclerView|1|

###### Bean classes needed:

**User**

|Attribute|Type|
|---------|----|
|id|Integer|
|firstName|String|
|secondName|String|
|avatar|String|

|Method|
|------|
|Getters and Setters|



