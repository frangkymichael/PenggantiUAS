package com.example.uas;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


//Tanggal :10 Agustus 2019
//Nim     :10116569
//Nama    :Frangky Michael
//Kelas   :IF-13
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("mahasiswa.db")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(configuration);
    }

}
