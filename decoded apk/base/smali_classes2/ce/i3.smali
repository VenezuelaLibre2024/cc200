.class public final Lce/i3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$b;
.implements Ljd/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/g$b;",
        "Ljd/g$c<",
        "Lce/i3;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lce/i3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/i3;

    invoke-direct {v0}, Lce/i3;-><init>()V

    sput-object v0, Lce/i3;->h:Lce/i3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b0(Ljd/g$c;)Ljd/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->c(Ljd/g$b;Ljd/g$c;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->b(Ljd/g$b;Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljd/g;)Ljd/g;
    .locals 0

    invoke-static {p0, p1}, Ljd/g$b$a;->d(Ljd/g$b;Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljd/g$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljd/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Ljd/g$b$a;->a(Ljd/g$b;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
