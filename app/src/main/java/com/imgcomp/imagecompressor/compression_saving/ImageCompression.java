package com.imgcomp.imagecompressor.compression_saving;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.content.ContentResolver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ImageCompression Class
 */
public class ImageCompression {
    private ImageView image;
    private Drawable tempImage;
    private Bitmap bitmap;
    private Uri imageUri;
    private ContentResolver resolver;
    private int quality;
    private Context context;

    /**
     *
     * @param image object of ImageView Class
     * @param imageUri Uri of Image
     * @param context Context of current Activity
     * @param quality Quality for Compression
     */

    public ImageCompression(ImageView image,Uri imageUri,Context context,int quality) {
        this.image = image;
        this.imageUri=imageUri;
        this.resolver= context.getContentResolver();
        this.context =context;
        this.quality=quality;
    }

    /**
     * Uses the Content Resolver from the context of the Activity from which the
     * IMageCOmpression Class Object was created and it's methods were called from
     * @return
     */
    private String getImageExtension(){
        String mimeType = resolver.getType(imageUri);
        String extension = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
        return(extension.equals("png")?".png":".jpeg");
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    //Converting Image
    public void convertImage() throws IOException {
        tempImage=image.getDrawable();
        bitmap = ((BitmapDrawable) tempImage).getBitmap();
        String extension=getImageExtension();
        String mimeType = getImageExtension().equals(".jpg") ? "image/jpeg" : "image/png";
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.DISPLAY_NAME, "Compressed_" + System.currentTimeMillis() + extension);
        values.put(MediaStore.Images.Media.MIME_TYPE, mimeType);
        values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/CompressedImages");
        Uri uri = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
        OutputStream out = context.getContentResolver().openOutputStream(uri);
        bitmap.compress(extension.equals(".jpg") ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG,quality, out);
        }
    }