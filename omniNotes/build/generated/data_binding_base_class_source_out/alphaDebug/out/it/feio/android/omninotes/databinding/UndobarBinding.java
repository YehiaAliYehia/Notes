// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UndobarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout undobar;

  @NonNull
  public final Button undobarButton;

  @NonNull
  public final TextView undobarMessage;

  private UndobarBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout undobar,
      @NonNull Button undobarButton, @NonNull TextView undobarMessage) {
    this.rootView = rootView;
    this.undobar = undobar;
    this.undobarButton = undobarButton;
    this.undobarMessage = undobarMessage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UndobarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UndobarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.undobar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UndobarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout undobar = (LinearLayout) rootView;

      id = R.id.undobar_button;
      Button undobarButton = rootView.findViewById(id);
      if (undobarButton == null) {
        break missingId;
      }

      id = R.id.undobar_message;
      TextView undobarMessage = rootView.findViewById(id);
      if (undobarMessage == null) {
        break missingId;
      }

      return new UndobarBinding((LinearLayout) rootView, undobar, undobarButton, undobarMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}