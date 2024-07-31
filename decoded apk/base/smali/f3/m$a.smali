.class public abstract Lf3/m$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lf3/m;
.end method

.method public abstract b(Lf3/k;)Lf3/m$a;
.end method

.method public abstract c(Ljava/util/List;)Lf3/m$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf3/l;",
            ">;)",
            "Lf3/m$a;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/Integer;)Lf3/m$a;
.end method

.method public abstract e(Ljava/lang/String;)Lf3/m$a;
.end method

.method public abstract f(Lf3/p;)Lf3/m$a;
.end method

.method public abstract g(J)Lf3/m$a;
.end method

.method public abstract h(J)Lf3/m$a;
.end method

.method public i(I)Lf3/m$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf3/m$a;->d(Ljava/lang/Integer;)Lf3/m$a;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lf3/m$a;
    .locals 0

    invoke-virtual {p0, p1}, Lf3/m$a;->e(Ljava/lang/String;)Lf3/m$a;

    move-result-object p1

    return-object p1
.end method
