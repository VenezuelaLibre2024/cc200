.class public final Lxd/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxd/d;
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

    invoke-direct {p0}, Lxd/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Lxd/d;
    .locals 1

    new-instance v0, Lxd/d;

    invoke-direct {v0, p1, p2, p3}, Lxd/d;-><init>(III)V

    return-object v0
.end method
