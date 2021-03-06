// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import it.feio.android.omninotes.models.views.InterceptorFrameLayout;
import it.feio.android.simplegallery.views.GalleryViewPager;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGalleryBinding implements ViewBinding {
  @NonNull
  private final InterceptorFrameLayout rootView;

  @NonNull
  public final GalleryViewPager fullscreenContent;

  @NonNull
  public final InterceptorFrameLayout galleryRoot;

  private ActivityGalleryBinding(@NonNull InterceptorFrameLayout rootView,
      @NonNull GalleryViewPager fullscreenContent, @NonNull InterceptorFrameLayout galleryRoot) {
    this.rootView = rootView;
    this.fullscreenContent = fullscreenContent;
    this.galleryRoot = galleryRoot;
  }

  @Override
  @NonNull
  public InterceptorFrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_gallery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGalleryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fullscreen_content;
      GalleryViewPager fullscreenContent = rootView.findViewById(id);
      if (fullscreenContent == null) {
        break missingId;
      }

      InterceptorFrameLayout galleryRoot = (InterceptorFrameLayout) rootView;

      return new ActivityGalleryBinding((InterceptorFrameLayout) rootView, fullscreenContent,
          galleryRoot);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
