// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SettingsFontSizeItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView summary;

  @NonNull
  public final TextView title;

  private SettingsFontSizeItemBinding(@NonNull RelativeLayout rootView, @NonNull TextView summary,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.summary = summary;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsFontSizeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsFontSizeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_font_size_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsFontSizeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.summary;
      TextView summary = rootView.findViewById(id);
      if (summary == null) {
        break missingId;
      }

      id = android.R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      return new SettingsFontSizeItemBinding((RelativeLayout) rootView, summary, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
