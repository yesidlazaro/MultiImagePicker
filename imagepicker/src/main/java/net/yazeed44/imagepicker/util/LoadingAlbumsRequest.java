package net.yazeed44.imagepicker.util;

import android.content.Context;

import com.octo.android.robospice.request.SpiceRequest;

import java.util.ArrayList;

/**
 * Created by yazeed44 on 6/13/15.
 */
public class LoadingAlbumsRequest extends SpiceRequest<ArrayList> {
    private final Context mContext;

    public LoadingAlbumsRequest(final Context context) {
        super(ArrayList.class);
        mContext = context;
    }

    @Override
    public ArrayList loadDataFromNetwork() throws Exception {
        return Util.getAlbums(mContext);
    }
}