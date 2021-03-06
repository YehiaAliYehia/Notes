// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WidgetLayoutBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final WidgetLayoutToolbarBinding toolbar;

  private WidgetLayoutBinding(@NonNull FrameLayout rootView,
      @NonNull WidgetLayoutToolbarBinding toolbar) {
    this.rootView = rootView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar;
      View toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }
      WidgetLayoutToolbarBinding binding_toolbar = WidgetLayoutToolbarBinding.bind(toolbar);

      return new WidgetLayoutBinding((FrameLayout) rootView, binding_toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
