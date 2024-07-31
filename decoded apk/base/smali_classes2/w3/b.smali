.class public final synthetic Lw3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw3/b;->a:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lw3/b;->a:I

    check-cast p1, Lw3/u$a;

    invoke-static {v0, p1}, Lw3/g;->k(ILw3/u$a;)V

    return-void
.end method
