.class public final synthetic Ln5/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/p;


# instance fields
.field public final synthetic h:Ln5/m;


# direct methods
.method public synthetic constructor <init>(Ln5/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/d;->h:Ln5/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Ln5/m;

    check-cast p1, Ls3/m1;

    invoke-static {v0, p1}, Ln5/m;->n(Ln5/m;Ls3/m1;)Z

    move-result p1

    return p1
.end method
