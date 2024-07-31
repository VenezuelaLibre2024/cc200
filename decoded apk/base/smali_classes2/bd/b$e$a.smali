.class public Lbd/b$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd/b$e;->a([Ljava/lang/Object;)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lbd/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lbd/b$e;


# direct methods
.method public constructor <init>(Lbd/b$e;)V
    .locals 0

    iput-object p1, p0, Lbd/b$e$a;->h:Lbd/b$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lbd/a;Lbd/a;)I
    .locals 0

    invoke-virtual {p1, p2}, Lbd/a;->b(Lbd/a;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lbd/a;

    check-cast p2, Lbd/a;

    invoke-virtual {p0, p1, p2}, Lbd/b$e$a;->a(Lbd/a;Lbd/a;)I

    move-result p1

    return p1
.end method
