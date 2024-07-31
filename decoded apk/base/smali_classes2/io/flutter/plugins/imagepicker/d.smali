.class public final synthetic Lio/flutter/plugins/imagepicker/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d;->h:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iput p2, p0, Lio/flutter/plugins/imagepicker/d;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->h:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iget v1, p0, Lio/flutter/plugins/imagepicker/d;->i:I

    invoke-static {v0, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->h(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V

    return-void
.end method
