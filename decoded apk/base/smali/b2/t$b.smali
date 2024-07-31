.class public Lb2/t$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lb2/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb2/t;->a()Lb2/v;

    move-result-object v0

    sput-object v0, Lb2/t$b;->a:Lb2/v;

    return-void
.end method
