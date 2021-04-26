package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment: Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul Arifin","Laki-Laki","samsul@stimata.ac.id","08123456789","Bogor"))
        listTeman.add(MyFriend("Dian Wahyuningsih","Perempuan","dian@sitimata.ac.id","081987654321","Sidoarjo"))
        listTeman.add(MyFriend("Indra Oki Sandy","Laki-Laki","indra_19310006@stimata.ac.id","089530603456","Malang"))
        listTeman.add(MyFriend("Tutik Anggraeni","Perempuan","tutik@gmail.com","08953222890","Bandung"))
        listTeman.add(MyFriend("bobby Irawan","Laki-Laki","bobby256@gmail.com","08654378890","Batu"))
        listTeman.add(MyFriend("Siska Angelia","Perempuan","siska398@gmail.com","0873448777","Jakarta"))
        listTeman.add(MyFriend("Sujarwo","Laki-Laki","jarwo@gmail.com","0857320182","Donomulyo"))
        listTeman.add(MyFriend("Hana Mulya","Perempuan","hana165@stimata.ac.id","0897625125578325","Jombang"))
    }
    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}