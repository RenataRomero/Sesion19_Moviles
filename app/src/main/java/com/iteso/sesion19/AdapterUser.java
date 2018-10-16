package com.iteso.sesion19;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iteso.sesion19.Beans.User;

import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.MyViewHolder>{

    private List<User> users;

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fullname, email;
        ImageView avatar;

        MyViewHolder(View view){

            super(view);

            fullname = view.findViewById(R.id.item_fullname);
            email = view.findViewById(R.id.item_user_mail);
            avatar = view.findViewById(R.id.item_avatar);
        }

    }

    public AdapterUser(List<User> users){

        this.users = users;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        return new MyViewHolder(item);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position){

        User user = users.get(position);
        myViewHolder.fullname.setText(user.getFirst_name() + " " + user.getLast_name());
        myViewHolder.email.setText(user.getFirst_name().toLowerCase() + "@iteso.mx");

    }

    @Override
   public int getItemCount(){

        return users.size();

    }


}
