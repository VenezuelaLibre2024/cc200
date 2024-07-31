.class public final Ll7/i;
.super Ll7/a$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ll7/a$j<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll7/a$j;-><init>()V

    return-void
.end method

.method public static D()Ll7/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Ll7/i<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ll7/i;

    invoke-direct {v0}, Ll7/i;-><init>()V

    return-object v0
.end method


# virtual methods
.method public B(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Ll7/a;->B(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public C(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Ll7/a;->C(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
