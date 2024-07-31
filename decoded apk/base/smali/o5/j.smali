.class public interface abstract Lo5/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/j$a;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract g(Lo5/m0;)V
.end method

.method public j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract k(Lo5/n;)J
.end method

.method public abstract o()Landroid/net/Uri;
.end method
