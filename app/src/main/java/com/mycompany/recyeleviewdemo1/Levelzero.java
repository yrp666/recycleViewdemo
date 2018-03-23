package com.mycompany.recyeleviewdemo1;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by Shinelon on 2018/3/22.
 */

public class Levelzero extends AbstractExpandableItem<Levelone> implements MultiItemEntity {

    public String friendGroup;

    public Levelzero(String friendName) {
        this.friendGroup = friendName;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getItemType() {
        return Adapter.TYPE_LEVEL_0;
    }
}
