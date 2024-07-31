.class public final synthetic Lj4/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj4/v$g;


# instance fields
.field public final synthetic a:Ls3/m1;


# direct methods
.method public synthetic constructor <init>(Ls3/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/r;->a:Ls3/m1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lj4/r;->a:Ls3/m1;

    check-cast p1, Lj4/n;

    invoke-static {v0, p1}, Lj4/v;->c(Ls3/m1;Lj4/n;)I

    move-result p1

    return p1
.end method
