.class public final Lt0/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lv0/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/k0<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, Lv0/t1$b;->r:Lv0/t1$b;

    sget-object v1, Lv0/t1$b;->t:Lv0/t1$b;

    invoke-static {}, Lt0/h;->U()Lt0/h;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Lv0/k0;->d(Lv0/t1$b;Ljava/lang/Object;Lv0/t1$b;Ljava/lang/Object;)Lv0/k0;

    move-result-object v0

    sput-object v0, Lt0/f$b;->a:Lv0/k0;

    return-void
.end method
