package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CredentialDatabase {
    public static final String DATABASE_NAME = "CredentialDatabase.db";
    public static final int DATABASE_VERSION = 2;
    public static final String LOG_TAG = "CredentialDatabase";
    private static CredentialDatabase instance;
    public URLCredentialDao credentialDao;

    /* renamed from: db */
    public CredentialDatabaseHelper f5368db;
    public URLProtectionSpaceDao protectionSpaceDao;

    private CredentialDatabase() {
    }

    private CredentialDatabase(CredentialDatabaseHelper credentialDatabaseHelper, URLProtectionSpaceDao uRLProtectionSpaceDao, URLCredentialDao uRLCredentialDao) {
        this.f5368db = credentialDatabaseHelper;
        this.protectionSpaceDao = uRLProtectionSpaceDao;
        this.credentialDao = uRLCredentialDao;
    }

    public static CredentialDatabase getInstance(Context context) {
        CredentialDatabase credentialDatabase = instance;
        if (credentialDatabase != null) {
            return credentialDatabase;
        }
        CredentialDatabaseHelper credentialDatabaseHelper = new CredentialDatabaseHelper(context);
        CredentialDatabase credentialDatabase2 = new CredentialDatabase(credentialDatabaseHelper, new URLProtectionSpaceDao(credentialDatabaseHelper), new URLCredentialDao(credentialDatabaseHelper));
        instance = credentialDatabase2;
        return credentialDatabase2;
    }

    public void clearAllAuthCredentials() {
        CredentialDatabaseHelper credentialDatabaseHelper = this.f5368db;
        credentialDatabaseHelper.clearAllTables(credentialDatabaseHelper.getWritableDatabase());
    }

    public List<URLCredential> getHttpAuthCredentials(String str, String str2, String str3, Integer num) {
        ArrayList arrayList = new ArrayList();
        URLProtectionSpace find = this.protectionSpaceDao.find(str, str2, str3, num);
        return find != null ? this.credentialDao.getAllByProtectionSpaceId(find.getId()) : arrayList;
    }

    public void removeHttpAuthCredential(String str, String str2, String str3, Integer num, String str4, String str5) {
        URLProtectionSpace find = this.protectionSpaceDao.find(str, str2, str3, num);
        if (find != null) {
            this.credentialDao.delete(this.credentialDao.find(str4, str5, find.getId()));
        }
    }

    public void removeHttpAuthCredentials(String str, String str2, String str3, Integer num) {
        URLProtectionSpace find = this.protectionSpaceDao.find(str, str2, str3, num);
        if (find != null) {
            this.protectionSpaceDao.delete(find);
        }
    }

    public void setHttpAuthCredential(String str, String str2, String str3, Integer num, String str4, String str5) {
        URLProtectionSpace find = this.protectionSpaceDao.find(str, str2, str3, num);
        Long valueOf = find == null ? Long.valueOf(this.protectionSpaceDao.insert(new URLProtectionSpace(null, str, str2, str3, num.intValue()))) : find.getId();
        URLCredential find2 = this.credentialDao.find(str4, str5, valueOf);
        if (find2 == null) {
            URLCredential uRLCredential = new URLCredential(null, str4, str5, valueOf);
            uRLCredential.setId(Long.valueOf(this.credentialDao.insert(uRLCredential)));
            return;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (!find2.getUsername().equals(str4)) {
            find2.setUsername(str4);
            z10 = true;
        }
        if (find2.getPassword().equals(str5)) {
            z11 = z10;
        } else {
            find2.setPassword(str5);
        }
        if (z11) {
            this.credentialDao.update(find2);
        }
    }
}
