.class public final Lce/k0$a;
.super Ljd/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljd/b<",
        "Ljd/e;",
        "Lce/k0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Ljd/e;->e:Ljd/e$b;

    sget-object v1, Lce/k0$a$a;->h:Lce/k0$a$a;

    invoke-direct {p0, v0, v1}, Ljd/b;-><init>(Ljd/g$c;Lsd/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lce/k0$a;-><init>()V

    return-void
.end method
