// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class WebviewBinding implements ViewBinding {
  @NonNull
  private final WebView rootView;

  @NonNull
  public final WebView webview;

  private WebviewBinding(@NonNull WebView rootView, @NonNull WebView webview) {
    this.rootView = rootView;
    this.webview = webview;
  }

  @Override
  @NonNull
  public WebView getRoot() {
    return rootView;
  }

  @NonNull
  public static WebviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WebviewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.webview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WebviewBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    WebView webview = (WebView) rootView;

    return new WebviewBinding((WebView) rootView, webview);
  }
}
