package tk.jamun.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.File;
import java.util.ArrayList;

import tk.jamun.ui.camera.classes.ActivityCamera;
import tk.jamun.ui.gallery.classes.ActivityGallery;
import tk.jamun.ui.gallery.classes.PickerMulti;
import tk.jamun.ui.gallery.helper.InterfaceGallery;
import tk.jamun.ui.gallery.model.ModelChild;
import tk.jamun.ui.utils.InterfaceUtils;

import static tk.jamun.ui.camera.classes.ActivityCamera.LIBRARY_COME_FROM_GALLERY;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_INTENT_COME_FOR;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_INTENT_FOR_MODEL;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_INTENT_MODE;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_MODE_MULTI;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_MODE_SINGLE;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_TYPE_ALL;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_TYPE_AUDIO;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_TYPE_FILE;
import static tk.jamun.ui.gallery.helper.InterfaceGallery.GALLERY_TYPE_IMAGE;
import static tk.jamun.ui.utils.InterfaceUtils.RESULT_IMAGE_PATH;

public class ActivityCameraGallery extends AppCompatActivity {
    private static final int ACTION_REQUEST_GALLERY = 999;
    private static final int ACTION_REQUEST_MANAGER = 113;
    private static final int ACTION_REQUEST_CAMERA = 111;
    private File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_gallery);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case ACTION_REQUEST_MANAGER:
                    break;
                case ACTION_REQUEST_GALLERY:
                    if (data.getIntExtra(GALLERY_INTENT_MODE, GALLERY_MODE_SINGLE) == GALLERY_MODE_SINGLE) {
                        ModelChild modelChild = data.getParcelableExtra(GALLERY_INTENT_FOR_MODEL);
                        if (modelChild != null)
                            try {
                            file = new File(modelChild.getFilePath());
                                startActivityForResult(new Intent(ActivityCameraGallery.this, ActivityCamera.class)
                                                .putExtra(InterfaceUtils.INTENT_COME_FROM, LIBRARY_COME_FROM_GALLERY)
                                                .putExtra(RESULT_IMAGE_PATH, file.getAbsolutePath()),
                                        ACTION_REQUEST_CAMERA);
                            } catch (Exception ignored) {
                            }
                    } else {
                        ArrayList<ModelChild> childArrayList = data.getParcelableArrayListExtra(GALLERY_INTENT_FOR_MODEL);
                        for (ModelChild modelChild : childArrayList) {
                             file = new File(modelChild.getFilePath());
                        }
                    }
                    break;
                case ACTION_REQUEST_CAMERA:
                    if (data != null) {
                         file = new File(data.getStringExtra(RESULT_IMAGE_PATH));
                    }
                    break;
            }
        }
    }

    public void onClickCamera(View view) {
        startActivityForResult(new Intent(this, ActivityCamera.class)
                , ACTION_REQUEST_CAMERA);
    }

    public void onClickCameraWithImage(View view) {
        if (file!=null){
            startActivityForResult(new Intent(ActivityCameraGallery.this, ActivityCamera.class)
                            .putExtra(InterfaceUtils.INTENT_COME_FROM, ActivityCamera.LIBRARY_COME_FROM_GALLERY)
                            .putExtra(RESULT_IMAGE_PATH, file.getAbsolutePath()),
                    ACTION_REQUEST_CAMERA);
        }
    }

    public void onClickGalleryActivity(View view) {
        startActivityForResult(new Intent(this, ActivityGallery.class)
                        .putExtra(GALLERY_INTENT_COME_FOR, GALLERY_TYPE_IMAGE)
                        .putExtra(GALLERY_INTENT_MODE, GALLERY_MODE_SINGLE)
                , ACTION_REQUEST_GALLERY);
    }

    public void onClickGalleryBottom(View view) {
        new PickerMulti().setThings(this, getSupportFragmentManager(), GALLERY_TYPE_IMAGE,
                GALLERY_MODE_SINGLE).onClickListener(new InterfaceGallery.InterfaceSingleModeItemClickListener() {
            @Override
            public void getResponse(ModelChild modelChild) {

            }
        }).setColumnCount(4).showPicker();

    }

    public void onClickGalleryActivityMulti(View view) {
        startActivityForResult(new Intent(this, ActivityGallery.class)
                        .putExtra(GALLERY_INTENT_COME_FOR, GALLERY_TYPE_ALL)
                        .putExtra(GALLERY_INTENT_MODE, GALLERY_MODE_MULTI)
                , ACTION_REQUEST_GALLERY);
    }

    public void onClickGalleryBottomMulti(View view) {
        new PickerMulti().setThings(this, getSupportFragmentManager(), GALLERY_TYPE_ALL,
                GALLERY_MODE_MULTI).onSubmitClickListener(new InterfaceGallery.InterfaceMultiModeItemClickListener() {
            @Override
            public void getResponse(ArrayList<ModelChild> selectedArrayList) {

            }
        }).showPicker();
    }

    public void onClickGalleryAudioActivity(View view) {
        startActivityForResult(new Intent(this, ActivityGallery.class)
                        .putExtra(GALLERY_INTENT_COME_FOR, GALLERY_TYPE_AUDIO)
                        .putExtra(GALLERY_INTENT_MODE, GALLERY_MODE_SINGLE)
                , ACTION_REQUEST_GALLERY);
    }

    public void onClickGalleryAudioBottom(View view) {
        new PickerMulti().setThings(this, getSupportFragmentManager(), GALLERY_TYPE_AUDIO,
                GALLERY_MODE_SINGLE).onClickListener(new InterfaceGallery.InterfaceSingleModeItemClickListener() {
            @Override
            public void getResponse(ModelChild modelChild) {

            }
        }).showPicker();
    }

    public void onClickGalleryFileActivity(View view) {
        startActivityForResult(new Intent(this, ActivityGallery.class)
                        .putExtra(GALLERY_INTENT_COME_FOR, GALLERY_TYPE_FILE)
                        .putExtra(GALLERY_INTENT_MODE, GALLERY_MODE_SINGLE)
                , ACTION_REQUEST_GALLERY);
    }

    public void onClickGalleryFileBottom(View view) {
        new PickerMulti().setThings(this, getSupportFragmentManager(), GALLERY_TYPE_FILE,
                GALLERY_MODE_SINGLE).onClickListener(new InterfaceGallery.InterfaceSingleModeItemClickListener() {
            @Override
            public void getResponse(ModelChild modelChild) {

            }
        }).showPicker();
    }

}
