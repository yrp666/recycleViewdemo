package com.mycompany.recyeleviewdemo1;

import android.view.View;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by Shinelon on 2018/3/23.
 */

public class Adapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static final int TYPE_LEVEL_0 = 0;
    public static final int TYPE_LEVEL_1 = 1;

    public Adapter(List<MultiItemEntity> data) {
        super(data);
        addItemType(TYPE_LEVEL_0, R.layout.levelzero);
        addItemType(TYPE_LEVEL_1, R.layout.levelone);
    }

    @Override
    protected void convert(final BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case 0:
                final Levelzero lv0 = (Levelzero) item;
                helper.setText(R.id.Lv0_tv, lv0.friendGroup);
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = helper.getAdapterPosition();
                        if (lv0.isExpanded()) {
                            collapse(pos);
                        } else {
                            expand(pos);
                        }
                    }
                });
                break;
            case 1:
                final Levelone lv1 = (Levelone) item;
                helper.setImageResource(R.id.Lv1_iv, lv1.friendSculpture);
                helper.setText(R.id.title_one, lv1.friendName);
                break;
        }
    }
}
