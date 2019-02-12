# API Call Practice
In this class we learned how to call an API from an Async Task on Android.

Using the sample url: [API URL](https://reqres.in/api/users?page=2)

You can receive a JSON with id, first name, second name and a link to an image which is the avatar. Once you receive it, you can display the info in an Android app.

###### Layouts and components needed:

`item_user`

|Components|Quantity|
|----------|--------|
|ImageView|1|
|TextView|2|

`activity_main`

|Components|Quantity|
|----------|--------|
|RecyclerView|1|

###### Bean classes needed:

`User`

|Attribute|Type|
|---------|----|
|id|Integer|
|firstName|String|
|secondName|String|
|avatar|String|

|Method|
|------|
|Getters and Setters|



Now, will create an `AdapterUser` for your `User` Bean Class, this will help you fill the components content in `item_user` template:

- Create a **global variable** User List type so you can have multiple users and access them from any method:
```
private List<User> users
```

- Inside your Adapter, create a ViewHolder and bind your variable with each component in your `item_user` with the help of the component id:

```
fullname = view.findViewById(R.id.item_fullname);
```
- Inflate the ViewHolder on `onCreateViewHolder`:
```
View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
```  
- And define the content of the components on `onBindViewHolder` with the attributes of each `User`, example:
```
myViewHolder.fullname.setText(user.getFirst_name() + " " + user.getLast_name());
```


