.class Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PendingCallState"
.end annotation


# instance fields
.field public final imageOptions:Lio/flutter/plugins/imagepicker/Messages$ImageSelectionOptions;

.field public final result:Lio/flutter/plugins/imagepicker/Messages$Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugins/imagepicker/Messages$Result<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final videoOptions:Lio/flutter/plugins/imagepicker/Messages$VideoSelectionOptions;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/imagepicker/Messages$ImageSelectionOptions;Lio/flutter/plugins/imagepicker/Messages$VideoSelectionOptions;Lio/flutter/plugins/imagepicker/Messages$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/Messages$ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/Messages$VideoSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/Messages$Result<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->imageOptions:Lio/flutter/plugins/imagepicker/Messages$ImageSelectionOptions;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->videoOptions:Lio/flutter/plugins/imagepicker/Messages$VideoSelectionOptions;

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->result:Lio/flutter/plugins/imagepicker/Messages$Result;

    return-void
.end method
