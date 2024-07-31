.class public final Lxd/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxd/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lxd/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lxd/f;
    .locals 1

    invoke-static {}, Lxd/f;->e()Lxd/f;

    move-result-object v0

    return-object v0
.end method
