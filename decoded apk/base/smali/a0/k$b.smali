.class public La0/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La0/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/k;->f(Lz/e$c;I)Lz/e$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/k$c<",
        "Lz/e$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La0/k;


# direct methods
.method public constructor <init>(La0/k;)V
    .locals 0

    iput-object p1, p0, La0/k$b;->a:La0/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lz/e$d;

    invoke-virtual {p0, p1}, La0/k$b;->c(Lz/e$d;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lz/e$d;

    invoke-virtual {p0, p1}, La0/k$b;->d(Lz/e$d;)Z

    move-result p1

    return p1
.end method

.method public c(Lz/e$d;)I
    .locals 0

    invoke-virtual {p1}, Lz/e$d;->e()I

    move-result p1

    return p1
.end method

.method public d(Lz/e$d;)Z
    .locals 0

    invoke-virtual {p1}, Lz/e$d;->f()Z

    move-result p1

    return p1
.end method
