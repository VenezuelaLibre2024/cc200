.class public final Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appName:Ljava/lang/String;

.field private bucket:Ljava/lang/String;

.field private tenantId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;
    .locals 2

    new-instance v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->appName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;->setAppName(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->tenantId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;->setTenantId(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->bucket:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;->setBucket(Ljava/lang/String;)V

    return-object v0
.end method

.method public setAppName(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public setBucket(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->bucket:Ljava/lang/String;

    return-object p0
.end method

.method public setTenantId(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp$Builder;->tenantId:Ljava/lang/String;

    return-object p0
.end method
