package com.mycompany.recyeleviewdemo1;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by Shinelon on 2018/3/22.
 */

public class Levelone implements MultiItemEntity {

    public String friendName;
    public int friendSculpture;

    public Levelone(String friendName, int friendSculpture) {
        this.friendName = friendName;
        this.friendSculpture = friendSculpture;
    }

    @Override
    public int getItemType() {
        return Adapter.TYPE_LEVEL_1;
    }
}
