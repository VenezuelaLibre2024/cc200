.class public final synthetic Lio/flutter/plugins/imagepicker/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/imagepicker/ImagePickerDelegate$OnPathReadyListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/a;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    return-void
.end method


# virtual methods
.method public final onPathReady(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/a;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    invoke-static {v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->a(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;)V

    return-void
.end method
