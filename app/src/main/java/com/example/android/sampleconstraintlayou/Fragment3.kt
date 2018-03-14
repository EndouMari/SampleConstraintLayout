package com.example.android.sampleconstraintlayou

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_3.*

/**
 * @author edm
 */
class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_3, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cell1.build("えんどう", "明日暇？", "10分前")
        cell2.build("ビール飲みに行こう！", "明日のお店は渋谷で19時開始です！", "1時間前")
    }
}
