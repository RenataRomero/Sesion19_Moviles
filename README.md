# API Call Practice
In this class we learned how to call an API from an Async Task on Android.

Using the sample url: [API URL](https://reqres.in/api/users?page=2)

You can receive a JSON with id, first name, second name and a link to an image which is the avatar. Once you receive it, you can display the info in an Android app.

> Note that this are reference notes for myself so I can remember how to repeat the exercise.

## Resources
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

## Main/Java/Beans

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

## Main/Java/Tools

> Pendant, we couldn't finish the lesson, investigate later

## Main/Java/
###### AdapterUser
Now, you will create an `AdapterUser` for your `User` Bean Class, this will help you fill the components content in `item_user` template so the RecycleView can create as many `item_user` as the users the respond JSON has:

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
- Define the content of the components on `onBindViewHolder` with the attributes of each `User`, example:
```
myViewHolder.fullname.setText(user.getFirst_name() + " " + user.getLast_name());
```
###### ActivityMain
Yaayyyy! Adapter done, next, you can proceed to work on `ActivityMain`, here is where you will create your AsyncTask.

- First create the next **global variables**:
```
ArrayList<User> users = new ArrayList<>();
AdapterUser adapterUser;
RecyclerView recyclerView;
```
- Then, on the method `onCreate` get the Recycler View with the help of the component id and create an instance of `AdapterUser`:
```
recyclerView = findViewById(R.id.activity_main_recycler);
adapterUser = new AdapterUser(users);
```
- Now, set the adapter for the Recycler View:
```
recyclerView.setAdapter(adapterUser);
```
###### ActivityMain/AsyncTask
> The new juice.

We import `import javax.net.ssl.HttpsURLConnection;` so we can get a stream with the download of de URL.

- `doInBackground`: this method will be executed asynchronous.
- `onPostExecute`: this method executes after the `doInBackground` method.
- `downloadUrl`: here we download a stream a convert it into string so we can access the JSON info.







