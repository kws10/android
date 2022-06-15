// Generated by view binder compiler. Do not edit!
package com.example.res_list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.res_list.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MenuItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView menuImg;

  @NonNull
  public final TextView menuName;

  private MenuItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView menuImg,
      @NonNull TextView menuName) {
    this.rootView = rootView;
    this.menuImg = menuImg;
    this.menuName = menuName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.menu_img;
      ImageView menuImg = ViewBindings.findChildViewById(rootView, id);
      if (menuImg == null) {
        break missingId;
      }

      id = R.id.menu_name;
      TextView menuName = ViewBindings.findChildViewById(rootView, id);
      if (menuName == null) {
        break missingId;
      }

      return new MenuItemBinding((ConstraintLayout) rootView, menuImg, menuName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}