.class public final Lv/c;
.super Lv/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lv/a<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv/a;-><init>()V

    return-void
.end method

.method public static z()Lv/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lv/c<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lv/c;

    invoke-direct {v0}, Lv/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public v(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lv/a;->v(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public w(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lv/a;->w(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
