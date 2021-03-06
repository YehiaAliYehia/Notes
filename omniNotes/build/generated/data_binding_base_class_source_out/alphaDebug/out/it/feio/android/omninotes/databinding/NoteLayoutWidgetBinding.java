// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteLayoutWidgetBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView attachmentThumbnail;

  @NonNull
  public final LinearLayout cardLayout;

  @NonNull
  public final TextView noteContent;

  @NonNull
  public final TextView noteDate;

  @NonNull
  public final TextView noteTitle;

  @NonNull
  public final FrameLayout root;

  @NonNull
  public final TextView tagMarker;

  private NoteLayoutWidgetBinding(@NonNull FrameLayout rootView,
      @NonNull ImageView attachmentThumbnail, @NonNull LinearLayout cardLayout,
      @NonNull TextView noteContent, @NonNull TextView noteDate, @NonNull TextView noteTitle,
      @NonNull FrameLayout root, @NonNull TextView tagMarker) {
    this.rootView = rootView;
    this.attachmentThumbnail = attachmentThumbnail;
    this.cardLayout = cardLayout;
    this.noteContent = noteContent;
    this.noteDate = noteDate;
    this.noteTitle = noteTitle;
    this.root = root;
    this.tagMarker = tagMarker;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteLayoutWidgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteLayoutWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_layout_widget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteLayoutWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachmentThumbnail;
      ImageView attachmentThumbnail = rootView.findViewById(id);
      if (attachmentThumbnail == null) {
        break missingId;
      }

      id = R.id.card_layout;
      LinearLayout cardLayout = rootView.findViewById(id);
      if (cardLayout == null) {
        break missingId;
      }

      id = R.id.note_content;
      TextView noteContent = rootView.findViewById(id);
      if (noteContent == null) {
        break missingId;
      }

      id = R.id.note_date;
      TextView noteDate = rootView.findViewById(id);
      if (noteDate == null) {
        break missingId;
      }

      id = R.id.note_title;
      TextView noteTitle = rootView.findViewById(id);
      if (noteTitle == null) {
        break missingId;
      }

      FrameLayout root = (FrameLayout) rootView;

      id = R.id.tag_marker;
      TextView tagMarker = rootView.findViewById(id);
      if (tagMarker == null) {
        break missingId;
      }

      return new NoteLayoutWidgetBinding((FrameLayout) rootView, attachmentThumbnail, cardLayout,
          noteContent, noteDate, noteTitle, root, tagMarker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
