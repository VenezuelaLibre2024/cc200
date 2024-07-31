.class public Lxe/f$j$a;
.super Lxe/f$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lxe/f$j;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lxe/i;)V
    .locals 2

    sget-object v0, Lxe/b;->m:Lxe/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lxe/i;->d(Lxe/b;Ljava/io/IOException;)V

    return-void
.end method
